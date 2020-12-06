package com.tugfeivecek.degiskenveveritipleri

import java.util.*

fun main(){

    // 5 kisinin ismini konsoldan girerek kayit islemini yapiniz ve girilen isimleri ekranda gosteriniz

    val girdi = Scanner(System.`in`)
    val isimler = Array<String>(5){""} // {"","Yeni Kayıt","","",""}

    for(i in 0 until isimler.count()) { //Dongu ının ıcerısınde 0'dan baslıcak until sag tarafına yazılanın bır eksıgıne kadar gıdıyo
       println("${i+1}. isim giriniz")
        val isim = girdi.next()
        isimler[i] = isim
    }
   for ((indeks,isim) in isimler.withIndex()){
       println("${indeks+1}. isim : $isim")
   }
}