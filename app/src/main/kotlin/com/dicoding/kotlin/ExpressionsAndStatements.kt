/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    
    // Expressions dan 
    
    val openOffice = 7
    val now = 20


    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office close")
    }

    // if diatas dikatakan sebagai statement karena ia tidak mengembalikan nilai apapun

    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)
    
    // If pada bahasa Kotlin juga bisa digunakan sebagai expression. Yang dimaksud dengan expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel


    // Expressions di dalam expression
    sum(1 , 1 * 4)

    // 1 * 4 adalah expression karena membalikan nilai 
    // dan sum adalah fungsi yang mengembalikan nilai



    // statement adalah inisialisasi sebuah variabel

    val value1 = 10
    val value2 = 10
 
    sum(value1, value2)

    // value1 dan value2 adalah statement , sedangkan sum fungsi sebuah expression
}


fun sum(value1: Int, value2: Int) = value1 + value2