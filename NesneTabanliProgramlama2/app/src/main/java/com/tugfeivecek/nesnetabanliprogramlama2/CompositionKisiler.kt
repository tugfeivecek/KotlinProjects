package com.tugfeivecek.nesnetabanliprogramlama2

fun main(){
    val adres = Adres("Bursa","Osmangazi")
    val kisi = Kisiler1("Ali",19,adres)

    println("Kisi ad  : ${kisi.ad} ")
    println("Kisi yaş  : ${kisi.yas} ")
    println("Kisi il  : ${kisi.adres.il} ")
    println("Kisi ilce  : ${kisi.adres.ilce} ")
}