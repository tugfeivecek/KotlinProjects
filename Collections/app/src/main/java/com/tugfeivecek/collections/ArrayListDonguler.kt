package com.tugfeivecek.collections

fun main(){


    val meyveler= ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for( meyve in meyveler ){
        println("Sonuc: $meyve ")
    }

    // indeks numarasını almak ıcın
    for((index,meyve) in meyveler.withIndex()){
        println("Sonuc: $index : $meyve ")
    }
}