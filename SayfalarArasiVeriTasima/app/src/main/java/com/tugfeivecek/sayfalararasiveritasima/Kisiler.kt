package com.tugfeivecek.sayfalararasiveritasima

import java.io.Serializable
// veri transferini gerceklestirmek icin serializable interfaceini alması gerekir
data class Kisiler (var tcno:Int,var isim:String,var boy:Double) :Serializable{

}