package com.tugfeivecek.collections

fun main(){
    val o1= Ogrenci(1,"Ahmet","11F")
    val o2= Ogrenci(2,"Zeynep","10R")
    val o3= Ogrenci(3,"Ceyda","9Z")

    val ogrenciler = HashSet<Ogrenci>()

    // Aynı turde kayıt yapmaz karısık yerlestirir

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)

    for( o in ogrenciler){

        println("*******************")
        println("Ogrenci no: ${o.no}")
        println("Ogrenci ad: ${o.ad}")
        println("Ogrenci sınıf: ${o.sinif}")
    }
}