package com.tugfeivecek.degiskenveveritipleri

fun main(){

    val meyveler = arrayOf<String>("Çilek","Muz","Elma","Kivi","Kiraz")
    // verileri teker teker almak icin dongu
    for( meyve in meyveler){ // meyveler icindeki eleman
       println("Sonuc: $meyve")
    }
    // indexlerini almak istersen
    for ((indeks,meyve)in meyveler.withIndex()){ // meyvenın ıcerıgı ve meyvenın ındeksini sol tarafina atiyacak
        println("Sonuç $indeks : $meyve")
    }
}

