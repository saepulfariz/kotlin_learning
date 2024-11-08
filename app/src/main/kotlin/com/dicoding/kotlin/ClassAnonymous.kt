/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

// Anonymous Class

// Seperti namanya, yang dimaksud dengan anonymous adalah class yang tak memiliki nama. Alih-alih mendefinisikan class menggunakan keyword class, Anda bisa langsung mendefinisikan isi dari sebuah class dengan menggunakan keyword object.

// Supaya lebih paham, perhatikan contoh kode di bawah ini.

interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

class Bird : IFly {
    override fun fly() {
        println("The Bird flying")
    }
}

fun main() {
    // Nah, sekarang kita coba ubah kode tersebut dengan menggunakan anonymous class. 
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird flying")
        }
    })

    // Perhatikan bahwa kita tidak membuat class Bird lagi, tetapi langsung mendefinisikan isi dari kelas tersebut dengan menggunakan keyword object. Jika dilihat, memang tidak ada nama yang diberikan untuk object yang dibuat ini, inilah yang disebut dengan Anonymous Class. 

}