/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    // Recursion
    // Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks. Di Kotlin, recursion disebut juga dengan recursive function.

    // Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri. Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali. Setiap pemanggilannya bisa kita atur agar dapat mengembalikan nilai dan digunakan sebagai argumen untuk pemanggilan fungsi berikutnya serta mengembalikan nilai akhir berupa perhitungan nilai kembalian dari setiap pemanggilan fungsi tersebut.

    // Lalu penyelesaian seperti apa yang dapat kita lakukan dengan recursive? Perhatikan kode di bawah ini:

    fun factorial(n: Int): Int {
        return if (n == 1) {
            n
        } else {
            var result = 1
            for (i in 1..n) {
                result *= i
            }
            result
        }
    }

    // Fungsi di atas adalah contoh bagaimana menghitung faktorial dari nilai yang kita tentukan. Nah, tidak ada yang salah dengan kode tersebut dan dapat dijalankan serta mengembalikan nilai sesuai dengan yang kita inginkan. Namun jika kita perhatikan, untuk menghitung nilai akhir, kode di atas menggunakan for loop yang di setiap iterasinya terdapat proses perhitungan nilai yang akan dikembalikan sebagai nilai akhir. Dengan recursive kita bisa menentukan nilai akhir tersebut dengan cara yang lebih sederhana. Berikut contoh ketika kode di atas ditulis dengan mekanisme recursive:

    fun factorial(n: Int): Int {
        return if (n == 1) {
            n
        } else {
            n * factorial(n - 1)
        }
    }

    // Ketika kita menjalankan fungsi di atas, program akan menciptakan tumpukan frame dengan jumlah berdasarkan nilai n di mana setiap frame akan mengkonsumsi memori. Ini bisa jadi masalah dalam penerapannya. Contoh, jika kita memasukkan argumen dengan nilai besar ketika ingin menggunakannya seperti berikut:

    println("Factorial 9999 is: ${factorial(9999)}")

    // Maka pada konsol akan menampilkan eror berikut:

    // Exception in thread "main" java.lang.StackOverflowError

    // Tail Call Recursion
    // Namun kita tidak perlu khawatir dengan masalah seperti di atas. Kotlin mendukung gaya pemrograman fungsional yang bernama tail recursion yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.

    // Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive. Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan. Contohnya adalah seperti berikut:

    fun factorial(n: Int, result: Int = 1): Int {
        val newResult = n * result
        return if (n == 1) {
            newResult
        } else {
            factorial(n - 1, newResult)
        }
    }

    // Namun dengan kode di atas kita tidak bisa langsung menghindari penumpukan frame. Ini karena secara default JVM tidak mendukung optimasi tail recursion. Untuk itu, Kotlin menyediakan modifier agar kita bisa tetap menerapkannya, yaitu modifier tailrec. Penggunaannya adalah seperti berikut:

    tailrec fun factorial(n: Int, result: Int = 1): Int {
        val newResult = n * result
        return if (n == 1) {
            newResult
        } else {
            factorial(n - 1, newResult)
        }
    }

    // Pada kode di atas, modifier tailrec ditempatkan sebelum kata kunci fun. Ketika sebuah fungsi ditandai dengan modifier tailrec, maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.
}