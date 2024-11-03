/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

// Kotlin memungkinkan kita untuk menambahkan sebuah fungsi baru pada sebuah kelas tanpa harus mewarisi kelas tersebut. Misalnya, jika ingin menambahkan fungsi baru untuk kelas Int, kita akan menuliskannya seperti berikut.

/*

class NewInt : Int(){
    fun printInt(){
        println("value $this")
    }
}

*/

// Kotlin mendukung 2 (dua) extension yang dapat digunakan, yaitu Extension Functions dan Extension Properties. Jika extension functions digunakan untuk menambahkan fungsi baru, extension properties tentunya digunakan untuk menambahkan sebuah properti baru.

// Extension Functions
// Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type, kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.).

fun Int.printInt() {
    print("value $this")
}

// Bisa kita perhatikan, kelas Int pada kode di atas digunakan sebagai receiver type, sedangkan kata kunci this adalah receiver type yang bertindak sebagai objeknya. Nilai dari objek tersebut bisa digunakan di dalam extension yang sudah dibuat. 


 
fun Int.plusThree(): Int {
    return this + 3
}


// Extension Properties

// Kotlin juga mendukung extension untuk menambah sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.

// Deklarasinya pun sama seperti extension functions. Kita terlebih dahulu menentukan receiver type kemudian nama dari properti tersebut. Contoh seperti berikut:

val Int.slice: Int
    get() = this / 2


// Infix Function

// Anda sudah mempelajari cara membuat sebuah function, mengelola, hingga menggunakannya. Untuk memanggil sebuah function, Anda melakukannya dengan memanggil nama function tersebut dan diakhiri dengan kurung buka tutup. Namun, ternyata ada cara lain dalam pemanggilan sebuah function. Anda bisa menggunakan infix function untuk memanggil suatu fungsi dengan cara yang lebih ringkas dan mirip dengan pemakaian operator matematika. 

/*
fun Int.sum(value: Int): Int {
    return this + value
}
*/

// val result = 5.sum(3)

infix fun Int.sum(value: Int): Int {
    return this + value
}

// val result = 5 sum 3 // Menggunakan Infix Function


/*

Namun, ada beberapa syarat untuk menggunakan infix function.

- Infix function harus merupakan sebuah member function atau extension function.

- Harus memiliki satu parameter saja.

- Parameter tidak boleh berupa generic dan tidak memiliki nilai default.

*/

// Perhatikan bahwa infix function harus selalu menerima parameter yang ditentukan. Ketika memanggil method dengan notasi infix, Anda bisa menggunakan this yang nantinya akan mereferensikan ke method tersebut. 

class MyHero {
    infix fun addHero(s: String) { /*...*/ }

    fun build() {
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}

fun main() {
    10.printInt()

    println("")

    println(10.plusThree())

    println(10.slice)

    val result = 5 sum 3

    println(result)
}