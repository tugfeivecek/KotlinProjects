package com.tugfeivecek.collections

fun main(){

    val o1= Ogrenci(1,"ahmet","11F")
    val o2 =Ogrenci(2,"zeynep","10R")
    val o3= Ogrenci(3,"ceyda","12A")
    val o4=Ogrenci(4,"Mehmet","9Z")
    val o5=Ogrenci(5,"Yasin","11F")

    val ogrenciler =ArrayList<Ogrenci>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    // filtreleme sonuc listesi 2 den buyuk olanlar icin

    val sonucListe=ogrenciler.filter{it.no > 2}  // {(it.ad).contains("a)
    for (o in sonucListe){
        println("******************")
        println("Ogrenci No: ${o.no}")
        println("Ogrenci Ad:  ${o.ad}")
        println("Ogrenci Sınıf: ${o.sinif}")
    }

}