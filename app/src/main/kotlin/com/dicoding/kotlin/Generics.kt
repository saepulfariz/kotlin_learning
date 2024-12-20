/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    // Konsep Generics pada Kotlin
    // Pada submodul sebelumnya, kita sudah belajar tentang Kotlin sebagai bahasa pemrograman yang bisa diklasifikasikan ke dalam OOP beserta konsep-konsep yang terdapat didalamnya. Kali ini kita akan mempelajari tentang Generics, yaitu sebuah konsep yang memungkinkan suatu kelas atau interface menjadi tipe parameter yang dapat digunakan untuk berbagai macam tipe data.

    // Berkenalan dengan Generics
    // Seperti yang kita ketahui, Kotlin termasuk dalam bahasa pemrograman statically typed. Ketika menambahkan variabel baru, secara otomatis tipe dari variabel tersebut dapat dikenali pada saat kompilasi. 

    // Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan. Pendeklarasiannya ditandai dengan tipe parameter. Kita juga bisa mengganti tipe parameter menjadi tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut.

    // Sebelum mempelajari cara mendeklarasikan sebuah kelas generic, ada baiknya jika kita melihat cara kerja generic pada variabel dengan tipe List. Kita perlu menentukan tipe dari nilai yang bisa disimpan dalam variabel List tersebut.

    // val contributor = listOf<String>("jasoet", "alfian","nrohmen","dimas","widy")

    // Perhatikan kode di atas. Tipe parameter yang digunakan dalam pemanggilan fungsi listOf() adalah String sehingga nilai yang bisa kita masukkan harus bertipe data String. Kita bisa menyederhanakannya dengan menghapus tipe parameter tersebut karena kompiler dapat menetapkannya secara otomatis.

    // val contributor = listOf("alfian","nrohmen","dimas","widy")

    // Berbeda ketika kita ingin membuat variabel list tanpa langsung menambahkan nilainya. List tersebut tidak memiliki nilai yang bisa dijadikan acuan untuk kompiler menentukan tipe parameter. Alhasil, kita wajib menentukannya secara eksplisit seperti berikut.

    // val contributor = listOf<String>()

    // Selain itu, kita juga bisa mendeklarasikan lebih dari satu tipe parameter untuk sebuah kelas. Contohnya adalah kelas Map yang memiliki dua tipe parameter yang digunakan sebagai key dan value. Kita bisa menentukannya dengan argumen tertentu, misalnya seperti berikut.

    // val points = mapOf<String, Int>( "alfian" to 10 , "dimas" to 20 )

    // Dengan begitu, kita juga bisa menyingkatnya menjadi seperti ini.

    // val points = mapOf("alfian" to 10, "dimas" to 20)

    // Tentunya, menentukan secara ekspilisit ini bisa dilakukan karena sudah ada nilai ketika dibuat. Namun, Anda perlu untuk menentukan tipe data dari object tersebut ketika nilainya belum ditetapkan.
}