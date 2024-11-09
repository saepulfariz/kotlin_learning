/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

data class Item(val key: String, val value: Any)

fun main() {
    // Distinct
    // Saat berurusan dengan item yang sama di dalam sebuah collection, untuk menyaring item yang sama tersebut kita akan melakukan iterasi dan membandingkan setiap itemnya. Namun dengan Kotlin kita tidak perlu melakukannya secara manual, karena Kotlin Collection menyediakan fungsi untuk melakukannya dengan mudah yaitu fungsi distinct(). Sebagai contoh:

    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)

    /*
        output: [1, 2, 3, 4, 5]
        */

    // Sama halnya seperti beberapa fungsi sebelumnya yang sudah dibahas, fungsi distinct() bisa langsung dipanggil dari objek collection. Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class. Misal seperti berikut:


    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )
    
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }
    
    /*
    output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
    */

    // Menariknya, kita bisa juga menentukan proses penyaringan item yang sama seperti apa yang akan dijalankan dengan menggunakan fungsi distinctBy(). Misal kita ingin menyaring item yang memiliki panjang sama, kita bisa melakukannya seperti berikut:


    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct1 = text.distinctBy {
        it.length
    }

    println(distinct1)

    /*
        output: [A, CC, EEE, GGGG]
        */
}