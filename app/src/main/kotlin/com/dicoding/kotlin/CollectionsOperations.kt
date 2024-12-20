/*
 * This source file was generated by the Gradle 'init' task
 */
package com.dicoding.kotlin

fun main() {
    // Collections Operations
    // Selain memiliki beberapa turunan yang baru saja kita bahas, Collection juga mempunyai beberapa fungsi operasi yang bisa kita gunakan untuk mengakses data di dalamnya. Sekarang saatnya kita akan mempelajari fungsi-fungsi yang dimaksud. 

    // filter() dan filterNot()
    // Mari kita mulai dari fungsi filter() dan filterNot() terlebih dahulu. Kedua fungsi tersebut akan menghasilkan list baru dari seleksi berdasarkan kondisi yang kita berikan. Sesuai dengan namanya, untuk mem-filter atau menyaring suatu data dalam sebuah collection. Contohnya dapat Anda lihat pada kode berikut.

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList)

    // evenList: [2, 4, 6, 8, 10]

    // Pada kode di atas, kita telah menggunakan filter() untuk menyaring bilangan yang habis dibagi 2 (dua) atau biasa disebut dengan bilangan genap. Selain itu kita juga dapat mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan. Caranya adalah dengan menggunakan fungsi filterNot().

    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)

    // notEvenList: [1, 3, 5, 7, 9]

    // Jadi, bisa disimpulkan bahwa filterNot() merupakan kebalikan dari filter().


    // map()

    // Fungsi yang akan sering dipakai berikutnya adalah map(). Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya. Kita ambil contoh dari numberList yang sudah ada. Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item sehingga Anda bisa menggunakan kode seperti berikut.

    // val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)

    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    // it pada kode di atas akan merepresentasikan masing-masing item pada numberList.


    // count()
    // Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection. Kembali gunakan contoh numberList, kita akan menampilkan jumlah item yang ada di dalamnya.


    // val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.count())

    // Output: 10

    // Cukup sederhana, bukan? Di dalam fungsi count() kita juga bisa menambahkan sebuah parameter yang berisi sebuah kondisi. Sebagai contoh kali ini kita akan menampilkan jumlah item pada numberList yang merupakan kelipatan dari 3.

    // val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.count { it % 3 == 0 })

    // Output: 3

    // Pada kode di atas konsol akan menampilkan 3 sebagai jumlah item yang merupakan kelipatan 3, yaitu: 3, 6, dan 9.


    // find(), firstOrNull(), & lastOrNull()

    // Selanjutnya adalah fungsi yang digunakan untuk mencari item pada sebuah collection. Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan, kita bisa menggunakan fungsi find(). Contoh, kita perlu mencari angka ganjil pertama dari numberList kodenya akan seperti berikut.

    // val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    println(numberList)
    println(firstOddNumber)
    println(firstOrNullNumber)

    // firstOddNumber: 1
    // firstOrNullNumber: null

    // Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull(). Artinya, jika di dalam collection tidak ditemukan data yang sesuai, fungsi akan mengembalikan nilai null. Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi. Kemudian, jika Anda ingin mencari item terakhir, gunakan fungsi lastOrNull().


    // first() & last()

    // Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa menambahkan sebuah kondisi dengan parameter. Namun, perlu diperhatikan jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi, apa hasilnya? Exception! Lihat saja contohnya pada kode berikut.


    // val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFirst = numberList.first()
    val numberLast = numberList.last()
    println(numberFirst)
    println(numberLast)
    // val moreThan10 = numberList.first { it > 10 }
    // println(moreThan10)

    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.

    // sum()
    // Mungkin Anda sudah tahu fungsi ini. Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka. Fungsi ini akan menjumlahkan setiap data yang ada pada collection.

    // val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList.sum()

    // total: 55

    println(total)

    // sorted()
    // sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending. Perhatikan kode di bawah ini.

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // ascendingSort: [i, k, l, n, o, t]

    // Namun, untuk sorting secara descending, kita dapat menggunakan fungsi sortedDescending().

    // val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]
}