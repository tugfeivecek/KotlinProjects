package com.tugfeivecek.ilerikotlin

class BirinciThread :Thread() {  //Thread sınıfını kalıtım almak

   // threadi kullanmamızı saglıyor
    override fun run() {

        for( i in 100..199){
            println("Birinci Thread : $i")
            Thread.sleep(100)

        }
    }
}