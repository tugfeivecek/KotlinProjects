package com.tugfeivecek.stringyapisi

fun main(){


    val str1= "Merhaba"
    println(str1.subSequence(0,3)) // String ifadesi dizi gibi o ıncı indexten basla -1 ine kadar git 2 ye kadar

    val str2= "Merhaba"
    if(str2.contains("er")){
        println("iceriyor")
    }

    val str3="Merhaba"

    println(str3.toUpperCase()) //Butun harfleri buyultur
    println(str3.toLowerCase()) //Butun harfleri kucultur

    val str4="Merhaba Nasılsın"
     // bosluk olan kısımları bırbırınden ayırır alt alta yazar
    val dizi= str4.split(" ")

    for( d in dizi){
        println(d)
    }

    val str5=" Merhaba "
    println(str5.trim())  //hem onundeki hem arkasındaki boslugu siler (Edittextler için)

}