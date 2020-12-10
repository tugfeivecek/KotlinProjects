package com.tugfeivecek.collections

fun main(){

    //ArrayList Tanımlamaları
     val liste=ArrayList<String>()
     val liste2 : ArrayList<Int> =ArrayList<Int>()

    val meyveler= ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Karpuz")
    meyveler.add("Armut")
    meyveler.add("Çilek")

    println(meyveler.toString())

    val str =meyveler.get(2)
    println(str)
    //Listeye mandalina ekleniyor
    meyveler.add("Mandalina")
    println(meyveler.toString())

    // 2.ye ananas ekle yenile
    meyveler[2] ="Ananas"
    println(meyveler.toString())

    meyveler.add(3,"Portakal")
    println(meyveler.toString())
}