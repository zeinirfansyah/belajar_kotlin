package org.zen.kotlin

//Data Types & Variable

/*
* variabel:
* var identifier: Type = initialization
*
* */

fun main(){
//    var = mutable (bisa di reassign)
    var name: String = "Zen"
    println("print name: " + name)

    name = "Zein Irfansyah" //reassign name
    println("print name setelah di reasign: " + name)

//    val = read only
    val perusahaan: String = "WillowLane"
    println("print perusahaan: " + perusahaan)

//    perusahaan = "WillowLame" //gak bisa di reassign, error
//    println("print perusahaan setelah di reasign: " + perusahaan)

//    operator pada variabel
    print(name + perusahaan)

    var angka1 = 1
    var angka2 = 2
    println(angka1 + angka2)

    var angka = 1
    angka += 2

    println(angka)
}