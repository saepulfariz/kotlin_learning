/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin


// Kotlin Standard Library 
// Kotlin hadir dengan berbagai fitur menarik yang sudah kita bahas pada sub-modul sebelumnya. Salah satu fitur yang selanjutnya perlu kita ketahui adalah standard function library, yaitu sebuah extension functions dari sebuah objek yang menggunakan lambda sebagai argumen atau yang disebut sebagai higher-order function.


// Scope Function
// Kotlin standard library memiliki beberapa fungsi yang tujuan utamanya adalah bagaimana menuliskan logika kode di dalam konteks dari sebuah objek. Dalam menggunakan fungsi tersebut, kita akan memanfaatkan lambda expression yang memiliki ruang lingkupnya sendiri yang dapat mengakses konteks dari sebuah objek.

// Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi yang berada di dalamnya antara lain let, run, with, apply, dan also. Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu mengeksekusi blok kode dari dalam sebuah objek. Yang membedakannya adalah bagaimana objek tersebut tersedia dan seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.

// Context Object
// Sebelum mengulas beberapa fungsi yang menjadi bagian dari scope function di atas, kita perlu mengetahui terlebih dahulu cara mengakses konteks sebuah objek dari dalam lambda yang menjadi bagian dari scope function. 

// Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it). Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.


// Lambda receiver (this)
// Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply. Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this. Misalnya seperti penggunaan fungsi apply berikut.


/*

val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

*/

// Cara ini memiliki kekurangan, yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada dari luar lingkup fungsi tersebut. Alih-alih cara ini lebih ditujukan untuk operasi objek itu sendiri, seperti memanggil fungsi dan inisialisasi nilai dari anggota yang menjadi bagian dari objek tersebut.

// Lambda argument (it)
// Selanjutnya, fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also. Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau diinisialisasikan untuk variabel lain. Contohnya seperti berikut.

/*

val text = "Hello"
text.let {
    val message = "$it Kotlin"
    println(message)
}


*/

// Secara default, nama dari argumen tersebut adalah it, tetapi kita dapat mengubahnya seperti berikut.

/*

val text = "Hello"
text.let { value ->
    val message = "$value Kotlin"
    println(message)
}

*/

// Dalam Kotlin, scope function menawarkan cara yang ringkas dan ekspresif untuk bekerja dengan objek sambil menghindari duplikasi kode. Setiap fungsi memiliki kasus penggunaan dan nilai kembalian yang berbeda seperti yang diringkas dalam tabel di bawah ini.

fun main() {

}