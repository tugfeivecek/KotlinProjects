package com.tugfeivecek.degiskenveveritipleri

fun main(){

    // Tanımlama
    val dizi1 = Array<Int>(5 ){0} //0,0,0,0,0
    val dizi2= arrayOf(1,10,7)
    val dizi3= arrayOf<Int> (1,36,9)
    val dizi4= arrayOf<String> ("Çilek","Ahmet")
    val dizi5= arrayOf (3,8,"Çilek","Ahmet")
    val meyveler= arrayOf<String>("Çilek","Muz","Elma","Kivi","Kiraz")
    // Verilere erisim
    val str1 =meyveler[2]
    println(str1)

    val str2= meyveler.get(3)
    println(str2)

    // Veri üzerinde işlem yapma
    meyveler[1]="Yeni Muz"
    println(meyveler.contentToString())

    meyveler.set(2,"Yeni Elma")
    println(meyveler.contentToString())

    // Array İşlemleri

    println(meyveler.isEmpty())  // true veya false cevabı dızımı bosmu dolumu "isEmpty Boş mu hayor dolu"

    println(meyveler.count())    // Boyutu

    println(meyveler.first())    // İlk elemanı

    println(meyveler.last())     // Son elemanı

    println(meyveler.indexOf("Kivi")) // ıcerigin index numarasi

    println(meyveler.sort()) // sıralama

    println(meyveler.contentToString()) // dizimizi gosterme

}