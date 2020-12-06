package com.tugfeivecek.nesnetabanliprogramalama

class KelimeHesaplamaClass {

    fun kelimeAdeti(kelime:String,harf:Char){
        var sonuc=0
        for(k in kelime){
            if(k==harf ){
                sonuc=sonuc+1

            }
        }
        println("Harf Adeti : $sonuc")
    }
}