package com.tugfeivecek.nesnetabanliprogramalama

fun main(){
  val bmw = Araba("kırmızı",20,false)
     println(bmw.renk)
     println(bmw.hiz)
     println(bmw.calisiyorMu)
     bmw.bilgiAl()
     bmw.durdur()

     bmw.hizlan(100)
     bmw.bilgiAl()
     bmw.yavasla(50)
     val sahin= Araba( "Sarı",100,true)
     sahin.bilgiAl()

}