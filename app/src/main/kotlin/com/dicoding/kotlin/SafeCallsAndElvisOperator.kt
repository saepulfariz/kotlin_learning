/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {

    // Safe Calls dan Elvis Operator
    // Di submodul sebelumnya kita sudah mengenal tentang NullPointerException dan cara penanganannya. Kini kita akan belajar bagaimana menangani objek nullable dengan cara yang lebih mudah, yaitu menggunakan Safe Calls dan Elvis Operator.

    // Safe calls operator (?.)
    // Yang pertama akan kita pelajari adalah Safe Calls. Seperti namanya, safe call akan menjamin kode yang kita tulis aman dari NullPointerException. Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable seperti berikut.

    val text: String? = null
    val textLength = text?.length

    println(textLength)

    // Elvis Operator (condition ? then : else)
    // Apakah Anda pernah mendengar penyanyi bernama Elvis Presley? Ya, beliau memiliki karakteristik yang dikenal dengan rambut jambulnya dan mirip dengan tanda operator ini. Tanda tanya menandakan rambutnya dan titik dua sebagai matanya. Seperti inilah ilustrasinya.

    // Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.

    val text2: String? = null
    val text2Length = text2?.length ?: 7

    println(text2Length)

    // sama hal nya
    // val textLength = if (text != null) text.length else 7


    // operator non-null assertion (!!)
    val text3: String? = null
    // val text3Length = text3!!.length // ready to go ???

    // Dengan menggunakan non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable. Namun, penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null. Sehingga, ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.
}
