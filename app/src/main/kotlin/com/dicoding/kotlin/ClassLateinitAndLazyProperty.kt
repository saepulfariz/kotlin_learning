/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

// Lateinit
// Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda. 
lateinit var name: String

// Lazy property

// Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null dan menunda inisialisasi

val name1: String by lazy {
    "Dicoding Miaw"
}

fun main() {
    
    name = "Dicoding Miaw"

    // cek variable udah diinisialisasi belum
    if (::name.isInitialized)
        println(name.length)
    else
        println("Not Initialized")

    // Hal yang perlu diperhatikan adalah lateinit harus disandingkan dengan keyword var (tidak bisa menggunakan val)

    
    println(name1.length)

    // Dalam menggunakan lazy property, Anda harus menggunakan keyword val. Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
}