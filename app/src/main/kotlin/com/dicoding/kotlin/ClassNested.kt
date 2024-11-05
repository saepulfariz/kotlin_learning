/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

// Nested Class
// Satu hal yang menarik ketika membuat Class di dalam Kotlin adalah Nested Class. Artinya, Anda bisa membuat Class baru di dalam sebuah Class. 


class House {
    // outer class
    // Properti outer class
    val buildingArea = 100
    class Room {

        val totalRooms = 4
        fun measureRoomArea() {
            // Member class tidak dapat mengakses properti pada outer class
            print(buildingArea/totalRooms)
        }

    }
}

// Hal ini berguna untuk mengorganisasi class dalam sebuah project supaya menjadi lebih baik. Apabila suatu class memang hanya digunakan oleh satu class lain saja dan keduanya memiliki hubungan yang erat, lebih baik dibuat nested class untuk meningkatkan enkapsulasi dan membuat kode lebih bersih.

// Hal yang perlu diperhatikan adalah member class tidak dapat mengakses property yang ada di outer class. Apabila Anda mencoba membuat kode seperti contoh di bawah ini, kode akan menampilkan error pada bagian buildingArea.


fun main() {
    val room = House.Room()
}