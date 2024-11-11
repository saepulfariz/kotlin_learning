/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin


// Kotlin Standard Library 
// Kotlin hadir dengan berbagai fitur menarik yang sudah kita bahas pada sub-modul sebelumnya. Salah satu fitur yang selanjutnya perlu kita ketahui adalah standard function library, yaitu sebuah extension functions dari sebuah objek yang menggunakan lambda sebagai argumen atau yang disebut sebagai higher-order function.


// Scope Function
// Kotlin standard library memiliki beberapa fungsi yang tujuan utamanya adalah bagaimana menuliskan logika kode di dalam konteks dari sebuah objek. Dalam menggunakan fungsi tersebut, kita akan memanfaatkan lambda expression yang memiliki ruang lingkupnya sendiri yang dapat mengakses konteks dari sebuah objek.

// Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi yang berada di dalamnya antara lain let, run, with, apply, dan also. Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu mengeksekusi blok kode dari dalam sebuah objek. Yang membedakannya adalah bagaimana objek tersebut tersedia dan seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.

// Context Object
// Sebelum mengulas beberapa fungsi yang menjadi bagian dari scope function di atas, kita perlu mengetahui terlebih dahulu cara mengakses konteks sebuah objek dari dalam lambda yang menjadi bagian dari scope function. 

// Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it). Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.


// Lambda receiver (this)
// Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply. Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this. Misalnya seperti penggunaan fungsi apply berikut.


/*

val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

*/

// Cara ini memiliki kekurangan, yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada dari luar lingkup fungsi tersebut. Alih-alih cara ini lebih ditujukan untuk operasi objek itu sendiri, seperti memanggil fungsi dan inisialisasi nilai dari anggota yang menjadi bagian dari objek tersebut.

// Lambda argument (it)
// Selanjutnya, fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also. Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau diinisialisasikan untuk variabel lain. Contohnya seperti berikut.

/*

val text = "Hello"
text.let {
    val message = "$it Kotlin"
    println(message)
}


*/

// Secara default, nama dari argumen tersebut adalah it, tetapi kita dapat mengubahnya seperti berikut.

/*

val text = "Hello"
text.let { value ->
    val message = "$value Kotlin"
    println(message)
}

*/

// Dalam Kotlin, scope function menawarkan cara yang ringkas dan ekspresif untuk bekerja dengan objek sambil menghindari duplikasi kode. Setiap fungsi memiliki kasus penggunaan dan nilai kembalian yang berbeda seperti yang diringkas dalam tabel di bawah ini.

// Fungsi	
// Sintaks	
// Deskripsi
// let	
// object.let { block }
// Menjalankan blok dengan it sebagai objek, mengembalikan hasil blok (atau Unit).


// run	
// object.run { block }
// Mirip dengan let, tetapi mengembalikan objek (berguna saat blok perlu memanggil metode objek).


// with	
// with(object) { block }
// Menjalankan blok dengan objek sebagai it, mengembalikan hasil blok.


// apply	
// object.apply { block }
// Menjalankan blok dengan objek sebagai it, mengembalikan objek yang dimodifikasi.


// also	
// object.also { block }
// Menjalankan blok dengan objek sebagai it, mengembalikan objek asli.


// Lalu, kapan kita harus menggunakan salah satu function tersebut? Tentunya, Anda perlu menyesuaikan dengan kebutuhan sebelum menentukannya. Contohnya perihal nilai yang dikembalikan dari setiap scope function.

    // apply dan also akan mengembalikan sebuah context object.
    // let, run, dan with akan mengembalikan sebuah hasil berupa lambda.
// Selain itu, Anda bisa juga lihat berdasarkan kelebihan dan kekurangan dari masing-masing scope function.

// Let:

// Kelebihan:

// Menggunakan let memungkinkan penggunaan variabel dengan cakupan yang terbatas pada blok kode tertentu (block-scoping).
// Dapat digunakan untuk mendeklarasikan variabel yang hanya akan digunakan di dalam blok tertentu.
// Kekurangan:

// Variabel yang dideklarasikan dengan let dapat di-reassign yang dapat menyebabkan perubahan tak terduga dalam program.


// Run:

// Kelebihan:

// Menjalankan blok kode tertentu dan mengembalikan hasil eksekusi.
// Berguna untuk mengeksekusi kode dengan lingkup (scope) yang terisolasi.
// Kekurangan:

// Pada beberapa kasus, penggunaan run mungkin membuat kode menjadi sulit dipahami karena blok kode dijalankan di luar konteks utama.


// With:

// Kelebihan:

// Dapat mempersingkat penulisan kode dengan memberikan blok kode akses langsung ke propertinya.
// Berguna untuk menghindari penulisan berulang-ulang dari variabel tertentu.


// Kekurangan:

// Penggunaan yang tidak hati-hati dari with dapat menyebabkan ambiguitas dan kesalahan, terutama jika ada nama variabel yang sama di luar blok with.
// Apply:

// Kelebihan:

// Digunakan untuk memanggil fungsi dengan argumen yang diambil dari koleksi (biasanya array atau list).
// Berguna untuk menjalankan fungsi dengan sejumlah argumen yang dinamis.
// Kekurangan:

// Dalam beberapa kasus, akan sulit untuk memahami kode yang menggunakan apply jika tidak jelas mengenai jenis dan jumlah argumen yang diharapkan.


// Also:

// Kelebihan:

// Berguna untuk melakukan beberapa operasi di dalam blok kode dan mengembalikan objek itu sendiri.
// Meningkatkan pembacaan dan pemahaman kode.
// Kekurangan:

// Pemahaman yang kurang baik tentang penggunaan also dapat menyebabkan kesalahan atau membuat kode sulit dibaca.

// Penting untuk mencatat bahwa penggunaan setiap scope function tergantung pada kebutuhan spesifik dan gaya pemrograman yang diinginkan. Pemilihan scope function harus mempertimbangkan kejelasan, konsistensi, dan efisiensi kode.

// Anda bisa melihat kode berikut untuk memudahkan perbedaan di setiap scope function. 

class Person(val name : String, val age : Int)

fun main() {
    // apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
    val personApply = Person("John", 25).apply {
        println("apply: Initializing $name, age $age")
    }

    // also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
    val personAlso = Person("Jane", 30).also {
        println("also: Initializing ${it.name}, age ${it.age}")
    }

    // let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
    val personLet = Person("Bob", 22).let {
        println("let: Initializing ${it.name}, age ${it.age}")
        "Result: ${it.name} is ${it.age} years old" // return value
    }
    println("let result: $personLet")

    // run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
    val personRun = Person("Alice", 28).run {
        println("run: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("run result: $personRun")

    // with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
    val personWithResult = with(Person("Charlie", 35)) {
        println("with: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
}