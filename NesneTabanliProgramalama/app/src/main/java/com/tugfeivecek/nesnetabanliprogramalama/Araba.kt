package com.tugfeivecek.nesnetabanliprogramalama

class Araba  (var renk: String  ,var hiz:Int , var calisiyorMu: Boolean) {
    //lateinit primity tiplerde gecerli değildir degısken null oldugunda cokme olabılır
    lateinit var otobus: Otobus

    // sınıfa davranıs kazandırabılır
   fun calistir(){
       calisiyorMu =true

   }
    fun durdur(){
        calisiyorMu=false
        hiz=0

    }
    fun hizlan(kacKm:Int){
        hiz=hiz+kacKm
    }
    fun yavasla(kacKm:Int){
        hiz=hiz-kacKm
    }
    fun bilgiAl(){
        println("Renk: $renk")
        println("Hız: $hiz")
        println("Calisiyormu: $calisiyorMu")
    }
}