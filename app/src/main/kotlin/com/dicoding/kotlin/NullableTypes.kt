/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    
    // Ketika mengembangkan sebuah program, ada satu hal yang tak boleh kita abaikan. Ia adalah NullPointerException (NPE), sebuah kesalahan yang terjadi saat ingin mengakses atau mengelola nilai dari sebuah variabel yang belum diinisialisasi atau variabel yang bernilai null. Karena sangat umum terjadi dan bisa berakibat fatal, NPE terkenal dengan istilah “The Billion Dollar Mistake”.


    // val text: String = null // compile time error

    // nullability
    val text: String? = null // ready to go
    
    // val textLength = text.length // compile time error

    var string: String? = "Dicoding"  
    if(string != null) { // smart cast  
        println(string.length) // It works now!  
    }  


    var obj: Any = "Dicoding" 

    if(obj is String) { 
        // Tidak membutuhkan casting secara eksplisit.  
        println("String length is ${obj.length}")  
    }  
}