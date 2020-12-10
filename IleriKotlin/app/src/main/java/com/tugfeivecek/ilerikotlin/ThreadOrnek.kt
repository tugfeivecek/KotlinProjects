package com.tugfeivecek.ilerikotlin

fun main(){


    val birinciThread = BirinciThread()
    birinciThread.start() // .start dersem thread mantıgı ıle calıstırır

    val ikiciThread = Thread (IkinciThread())
    ikiciThread.start()

    for(i in 900..999){
        println("Main Thread : $i")
        Thread.sleep(100)

    }

}