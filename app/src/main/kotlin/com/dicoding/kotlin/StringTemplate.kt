/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    
    val name = "Kotlin"
    println("My name is " + name)

    println("My name is $name")

    val old = 3
    println("My name is $name, im $old years old")

    val hour = 7
    println("Office ${if (hour > 7) "already close" else "is open"}")
}