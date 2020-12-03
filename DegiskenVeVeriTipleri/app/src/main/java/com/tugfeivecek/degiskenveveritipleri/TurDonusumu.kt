package com.tugfeivecek.degiskenveveritipleri

import java.util.*

fun main(){
    var i: Int = 42
    var d: Double = 42.45
    var f: Float = 42.89f


    //Konsol Girdisi
    println("Adınızı giriniz")
    val girdi = Scanner(System.`in`)
    val ad= girdi.next()
    // val sayi= girdi.nexInt()
    println("Adınız: $ad")


    var sonuc1 : Int =d.toInt()
    var sonuc2: Double =i.toDouble() //int olanı doublea cevirir
    var sonuc3 : Int = f.toInt()
    var sonuc4: String =i.toString()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)
    println(sonuc4)


    var yazi ="67y"
    var z =yazi.toIntOrNull() // ıfadeyı nulla cevırmek
    // sorun yoksa sonucu gostericek sorun varsa direk null donucek
    z?.let {
        println("z: $z")
    }
}