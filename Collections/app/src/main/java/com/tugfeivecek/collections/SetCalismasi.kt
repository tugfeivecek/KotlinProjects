package com.tugfeivecek.collections


fun main(){
    val meyveler = setOf("Çelik","Muz","Elma","Kivi")
    val iller= mutableSetOf<String>("Bursa","İller","Ankara","İzmir")

    val sayilar = HashSet<Int>()
// icinde aynı veri varsa kayıt etmıyo
    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())
    sayilar.add(20)
    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())

    for( s in sayilar) {
        println(s)
    }
    for((i,s) in sayilar.withIndex()){
        println("$i . -> $s")

    }
}

