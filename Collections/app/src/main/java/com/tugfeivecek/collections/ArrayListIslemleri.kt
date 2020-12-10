package com.tugfeivecek.collections

fun main(){

    val meyveler= ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("muz")
    meyveler.add("kiraz")
    meyveler.add("armut")
    meyveler.add("visne")

    println(meyveler.isEmpty()) // false

    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.contains("muz")) // icinde var mı
    meyveler.reverse()  // ArayListi ters cevir
    println(meyveler.toString())
  // 3.elemnı sil
    meyveler.removeAt(3)
    println(meyveler.toString())

    meyveler.remove("armut")
    println(meyveler.toString())

    meyveler.clear() // arraylist icindeki butun verileri siler

}