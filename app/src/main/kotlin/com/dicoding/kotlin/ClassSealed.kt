/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

// Sealed Class

// Sealed Class merupakan jenis class khusus yang juga digunakan untuk pembatasan hierarki class. Artinya, semua turunannya harus sesuai dengan yang didefinisikan di dalam class tersebut. Jadi, tidak boleh menurunkan class di luar dari Sealed Class yang sudah dibuat.

// Sealed Class sebenarnya mirip dengan Enum Class, tetapi jauh lebih fleksibel. Berbeda dengan Enum Class yang hanya dapat berisi satu objek (instance) yang sama per class, Sealed Class dapat berisi beberapa objek yang berbeda-beda untuk memberikan informasi lebih. 

// Misalnya, Anda ingin membuat state untuk mengetahui proses dalam pengambilan data. Berikut contoh penerapannya jika menggunakan Enum.

/*

enum class Result {
    SUCCESS,
    ERROR,
    LOADING
}

*/

// Nah, mari kita bandingkan jika kita menggunakan Sealed Class. 

sealed class Result {
    data class Success(val data: T) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

//  Seperti yang Anda lihat, sebuah Sealed Class bisa berisi data class, object, class biasa, atau bahkan sealed class lainnya. Dengan memanfaatkan Sealed Class, kita bisa mendapatkan data yang berbeda untuk setiap kondisi yang ditentukan. Sangat fleksibel, bukan? 

// Hal yang perlu diperhatikan ketika menggunakan Sealed Class adalah ia bersifat exhaustive. Artinya, Anda harus menangani setiap kondisi yang ditentukan pada Sealed Class. 

fun main() {
    val result: Result = Result.Error("Oops!")
    when (result) {
        //jika salah satu kondisi dihapus, kode akan error
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading...")
        }
    }

    // Catatan:
    // Sealed Class menggunakan Abstract Class di balik layar sehingga Anda tidak dapat menginisialisasi Sealed Class secara langsung.

    // Dengan sifatnya itu, program yang Anda buat akan menjadi lebih aman karena semua kemungkinan sudah pasti teratasi. Berbeda jika kita hanya menggunakan Interface, bisa jadi ada kelas yang belum teratasi karena tidak ada mekanisme pengecekan pada saat compile-time seperti Sealed Class. 

    // Nah, dari sini Anda sudah mulai paham ‘kan alasan ia disebut sebagai Sealed Class? Hal ini karena Class ini dapat menyegel (seal) kondisi apa saja yang perlu diperiksa ketika ia digunakan.
}