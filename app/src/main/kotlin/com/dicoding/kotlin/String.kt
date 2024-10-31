/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    
    val textString : String  = "Kotlin"

    val text  = "Dicoding"
    val firstChar = text[3] // array first index 0
 
    println("The 4th character of the $text is $firstChar")

    /*
    output : The 4th character of the Dicoding is o
    */

    val texts  = "Kotlin"
    for (char in texts){
        print("$char ")
    }

    /*
    output : K o t l i n 
    */

    // Literal String,
    // 1. Escaped String
    // 2. Raw String


    // 1. Escaped String

    // val statement = "Kotlin is Awesome!"
    // val statement = "Kotlin is "Awesome!""

    val statement = "Kotlin is \"Awesome!\""

    println(statement)

    /*

    \t: menambah tab ke dalam teks.
    \n: membuat baris baru di dalam teks.
    \’: menambah karakter single quote kedalam teks.
    \”: menambah karakter double quote kedalam teks.
    \\: menambah karakter backslash kedalam teks.
    
    */

    val name = "Unicode test: \u00A9"

    println(name)

    /*
    output: Unicode test : ©
    */
    

    // 2. Raw String

    // val line = "Line 1\n" +
    //     "Line 2\n" +
    //     "Line 3\n" +
    //     "Line 4\n"

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
 
    print(line)

    /*
        output:
        Line 1
        Line 2
        Line 3
        Line 4
    */
}