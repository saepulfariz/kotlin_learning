/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    // Conjunction atau AND (&&)

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    // sederhana
    // val isOpen = now >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen")

    /*
        Output : Office is open : false
    */

    // Disjunction atau OR (||)

    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")
    /*
        Output : Office is closed : true
    */


    // Negation atau NOT (!)

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
    
    /*
        Output : Office is open
    */
}
