/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    // Data Class

    // Kotlin mengenalkan konsep data class yang merupakan sebuah kelas sederhana yang bisa berperan sebagai data container. Data class adalah sebuah kelas yang tidak memiliki logika apapun dan juga tidak memiliki fungsionalitas lain selain menangani data.

    // Kenapa disebut dengan kelas sederhana? Seperti yang sudah kita ketahui, Kotlin memungkinkan kita untuk menulis kode dengan ringkas dan lebih efisien. Dalam membuat sebuah data class, kita tidak perlu menuliskan banyak kode yang seharusnya dibutuhkan untuk mengelola sebuah data. Data class mampu menyediakan beberapa fungsionalitas yang biasanya kita butuhkan untuk mengelola data hanya dengan sebuah keyword data.

    data class User(val name : String, val age : Int)

    // Hanya dengan satu baris kode di atas, kompiler akan secara otomatis menghasilkan constructor, toString(), equals(), hashCode(), copy() dan juga fungsi componentN(). Tentunya ini jauh lebih mudah dan bersih dibandingkan kita harus menuliskan banyak kode secara manual.

    // Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:

    // - Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
    // - Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
    // - Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
}