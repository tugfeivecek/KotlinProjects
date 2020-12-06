package com.tugfeivecek.degiskenveveritipleri


import kotlin.math.*
import kotlin.random.Random
fun main(){
    /* for (i in 1..10){
    val rasgeleSayi= Random.nextInt(0,10) // random sınıfından bir sayi urettık 0'dan 10'a kadar 0ile 9
            println(rasgeleSayi)
} */
    val c = ceil(6.5) // Sayiyi yukari yuvarla
    println("c : $c")

    val f = floor(6.5) // Sayiyi alta yuvarlama
    println("f : $f")

    val s = sqrt(4.0) // Karekok islemi
    println("s : $s")

    val a = abs(-10) // Mutlak degerini alma
    println("a : $a")

    val p = 2.0.pow(3.0) // uslu sayı 2^3 anlamında
    println("p : $p")



}