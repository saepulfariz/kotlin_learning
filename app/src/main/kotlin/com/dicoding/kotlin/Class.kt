/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.Kotlin


// 4 PILAR OOP

/*

Inheritance
Pewarisan adalah konsep di mana sebuah objek dapat mewarisi sifat atau perilaku dari objek lain. Analoginya seperti hubungan keluarga, di mana anak dapat mewarisi sifat atau karakteristik tertentu dari orang tuanya. Pewarisan memungkinkan untuk mendefinisikan objek baru berdasarkan objek yang sudah ada.

Encapsulation
Enkapsulasi diibaratkan sebuah kantong yang menyimpan sesuatu. Dalam pemrograman, enkapsulasi berfungsi untuk mengumpulkan data dan metode yang berhubungan ke dalam sebuah objek. Saat menggunakan encapsulation, data dapat diisolasi dan tidak dapat diakses langsung dari luar. Dengan begini, kita cukup menggunakan data tersebut tanpa harus tahu proses yang terjadi di dalamnya.

Abstraction
Abstraksi dapat dilakukan dengan menghilangkan kompleksitas dan detail yang tidak perlu dari suatu objek sehingga hanya menampilkan informasi penting saja. Sebagai contoh, saat mengendarai mobil, pengemudi tidak perlu tahu detail bagaimana mesin bekerja, tetapi hanya perlu memahami cara menggunakan pedal gas, rem, dan setir. Abstraksi memudahkan pemrograman dengan menyembunyikan detail implementasi yang kompleks.

Polymorphism
Polimorfisme memungkinkan objek dengan tipe yang berbeda untuk diproses dengan cara yang serupa. Ini mirip dengan kemampuan manusia untuk beradaptasi dengan berbagai situasi. Dalam pemrograman, polimorfisme dapat dilihat melalui metode-metode yang memiliki nama yang sama, tetapi perilaku yang berbeda tergantung pada objek yang memanggilnya.

 */


class Animal() {
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true
   
    fun eat(){
        println("$name makan!")
    }
 
    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()

    // Mengubah Properti dari class dicodingCat
    dicodingCat.name = "Kucing Oren"
    dicodingCat.weight = 6.0
    dicodingCat.age = 3
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()
}