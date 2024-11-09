/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    // Take
    // Jika fungsi drop() digunakan untuk memangkas, fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection. Pemanggilan fungsi take() sama halnya seperti fungsi drop() di mana kita perlu menentukan jumlah item yang akan disaring. Berikut contoh penggunaannya:


    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    /*
        output: [1, 2, 3]
    */

    // Kotlin juga menyediakan fungsi seperti dropLast() yang menjalankan operasi dari posisi atau indeks terakhir yaitu takeLast(). Contohnya seperti berikut:

    // val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.takeLast(3)

    println(take)

    /*
        output: [4, 5, 6]
    */
}