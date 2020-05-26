package com.duck

fun main(){
    // Perbedaan val dan var dalam pembuatan variabel di kotlin
    // Var adalah object Mutable dimana isinya dapat diubah ubah.
    var name = "Duck"
    // name akan jadi rendi jika kode di bawah di uncoment
    // name = "rendi" // Uncomment/comment kode ini
    // Val adalah object Immutable dimana isinya tidak dapat diubah ubah.
    val num = "777"
    // jika num di ganti maka akan terjadi seperti di bawah ini
    //  Kotlin: Val cannot be reassigned
    // num = "888" // Uncomment/comment kode ini
    // Untuk pemangilan nama saya gunakan string literal dan pemanggilan biasa untuk num
    println("$name "+num)
}