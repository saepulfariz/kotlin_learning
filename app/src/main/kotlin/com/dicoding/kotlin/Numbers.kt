/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    
    // Int (32 Bit)
    // range -2^31 sampai +2^31-1

    val intNumber = 100


    // Long (64 Bit)
    // range -2^63 sampai +2^63-1

    val longNumber: Long = 100

    // or suffix L 

    // val longNumber = 100L


    // Short (16 Bit)
    val shortNumber: Short = 10

    // Byte (8 Bit)
    // Dengan ukuran yang kecil, Byte hanya mampu menyimpan nilai yang kecil sama halnya seperti Short. Byte biasa digunakan untuk keperluan proses membaca dan menulis data dari sebuah stream file atau jaringan.

    val byteNumber = 0b11010010


    // Double (64 Bit)
    // Sama halnya dengan Long yang memiliki ukuran yang besar, Double mampu menyimpan nilai numerik yang besar pula. Pada umumnya Double digunakan untuk menyimpan nilai numerik pecahan sampai dengan maksimal 15-16 angka di belakang koma.

    val doubleNumber: Double = 1.3


    // Float (32 Bit)
    // Sama seperti Double, namun memiliki ukuran yang lebih kecil, yakni hanya sampai 6-7 angka di belakang koma.

    val floatNumber: Float = 0.123456789f    // yang terbaca hanya 0.1234567


    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    /*
    output :
            2147483647
            -2147483648
    */

    // val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    /*
        Output :

        Max Int: 2147483647
        Over range Int: -2147483648 
    */


    // val numberOne = 1
    // val numberTwo = 2

    // Terdapat beberapa operator matematika pada tipe data Number seperti penjumlahan (+), pengurangan (-), perkalian (*) , pembagian (/) dan modulus (%, atau sisa hasil bagi).

    println(1 + 2)

    /*
        output : 3
    */


    val numberOne: Int = 27
    val numberTwo: Int = 10

    println(numberOne / numberTwo)

    // Perlu diketahui, hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah

    /*
        output : 2
    */

    // Sama seperti perhitungan matematika di mana operasi perkalian dan pembagian didahulukan

    println(5 + 4 * 4)

    /*
    output: 21
    */

    // Operasi 4 * 4 akan dilakukan terlebih dahulu, kemudian diikuti 5 + 16. Jika ingin operasi 5 + 4 dilakukan terlebih dahulu, gunakan tanda kurung:

    println((5 + 4) * 4)

    /*
    output: 36
    */

    // Di Kotlin kita tidak bisa melakukan konversi secara langsung
    val byteNumber1: Byte = 1
    // val intNumber: Int = byteNumber1 // compile error

    val intNumber1: Int = byteNumber1.toInt() // ready to go

    /*

    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
    
    */

    val stringNumber = "23"
    val intNumber2 = 3

    println(intNumber2 + stringNumber.toInt())
    /*
    output: 26
    */

    // Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable” dengan menggunakan tanda underscores seperti berikut:

    val readableNumber = 1_000_000
    println(readableNumber)

    /*
    output : 1000000
    */
}