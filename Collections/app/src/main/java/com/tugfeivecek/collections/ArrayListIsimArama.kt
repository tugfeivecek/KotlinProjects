package com.tugfeivecek.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner( System.`in`)
    val isimler= ArrayList<String>()

    isimler.add("Ahmet")
    isimler.add("Mehmet")
    isimler.add("Zeynep")
    isimler.add("Ercan")

    println("Aratmak icin isim giriniz")
    val isim = girdi.next()

    for( i in isimler){
        if( i == isim){
            println("İSİM MEVCUT")
            break
        }
    }
}