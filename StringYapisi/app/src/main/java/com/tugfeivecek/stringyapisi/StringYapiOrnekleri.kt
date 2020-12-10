package com.tugfeivecek.stringyapisi

fun main(){

    val str1 = "Merhaba"
    println(str1)
    val str2 = String()
 //   str2 ="Kotlin"
    println(str2)

    val str3 ="""
        Nasılsın
        Merhaba
        Hey
    """.trimIndent()

    println(str3)

    val str4=""
    val str5= String()
    if(str4.isEmpty()){
        println("str4 bo")}
            else{
                println("str4 dolu")
        }
    val str6= "Merhaba"

    for(s in str6){
        println(s)
    }
        }
