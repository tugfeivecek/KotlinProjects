package com.tugfeivecek.collections

fun main(){

    // key value ilişkisi ile çalışır
    val sayilar = mapOf<Int,String>(1 to "Bir",2 to "İki")

    val oranlar= mutableMapOf(1.5 to "Oran1", 3.4 to "Oran2")

    val iller = HashMap<Int,String>()

    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    println( iller.toString())

    iller.put(16,"Yeni Bursa")
    println( iller.toString())

    println( iller.get(34))
}