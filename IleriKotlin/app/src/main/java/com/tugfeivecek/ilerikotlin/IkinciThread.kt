package com.tugfeivecek.ilerikotlin

class IkinciThread : Runnable {  // interfaceinden almak

    override fun run() {

        for( i in  200..299){
           println("İkinci Thread : $i")
            Thread.sleep(100)

        }
    }
}