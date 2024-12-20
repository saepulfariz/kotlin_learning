/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

// Exception Handling
// Exception handling dapat diterapkan dengan beberapa cara. Di antaranya adalah dengan menggunakan try-catch, try-catch-finally, dan multiple catch.


import kotlin.NumberFormatException

fun main() {
    // try-catch

    // Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch. Kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi, maka blok catch akan terpanggil.

    /*

    try {
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: SomeException) {
        // Block catch akan terpanggil ketika exception bangkit.
    }
    
    */

    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
 
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }


    
    // try-catch-finally

    // Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional. finally akan dieksekusi setelah program keluar dari blok try ataupun catch. Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga. Exception tidak terduga terjadi ketika kita menggunakan NullPointerException pada catch namun exception yang terjadi adalah NumberFormatException.

    val someNullValue1: String? = null
    lateinit var someMustNotNullValue1: String
 
    try {
        someMustNotNullValue1 = someNullValue1!!
    } catch (e: Exception) {
        someMustNotNullValue1 = "Nilai String Null"
    } finally {
        println(someMustNotNullValue1)
    }


    // Multiple Catch
    // Dari kode yang kita coba sebelumnya, kita menggunakan exception untuk menangani semua tipe exception yang terjadi. Baik itu ketika terjadi NullPointerException atau NumberFormatException. Sebenarnya pada catch kita dapat secara spesifik memilih tipe exception apa yang ingin ditangani. Multiple catch memungkinkan untuk penanganan exception dapat ditangani lebih dari satu tipe exception. Hal ini sangat berguna ketika kita ingin menangani setiap tipe exception dengan perlakuan yang berbeda. Berikut contoh struktur kode dengan menerapkan multiple catch:

    /*
    
    try{
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: NullPointerException) {
        // Block catch akan terpanggil ketika terjadi NullPointerException.
    } catch (e: NumberFormatException) {
        // Block catch akan terpanggil ketika terjadi NumberFormatException.
    } catch (e: Exception) {
        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
    }
    finally {
        // Block finally akan terpanggil setelah keluar dari block try atau catch
    }
    
    */

    

    val someStringValue: String? = null
    var someIntValue: Int = 0
 
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}