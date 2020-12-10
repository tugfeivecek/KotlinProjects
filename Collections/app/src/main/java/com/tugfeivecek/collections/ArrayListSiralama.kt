package com.tugfeivecek.collections


fun main(){

     val k1= Kisiler(1,"Ahmet")
     val k2= Kisiler(2,"Zeynep")
     val k3= Kisiler(3,"Berna")

     val kisilerArrayList=ArrayList<Kisiler>()
     kisilerArrayList.add(k1)
     kisilerArrayList.add(k2)
     kisilerArrayList.add(k3)

     println("Önce")

     for( k in kisilerArrayList){
         println("${k.kisiNo} - ${k.kisiAdi} ")
    }
         println("Sayilar Küçükten Büyüğe")
     //siralama it arraylistin icindeki elemana isaret ediyo
     val siralamaArrayList1=kisilerArrayList.sortedWith(compareBy{it.kisiNo})
    // kiisler araylistini kisinoya gore sıralayacak sonucunu arayayliste aktarıcak

    for( k in siralamaArrayList1){
        println("${k.kisiNo}-${k.kisiAdi} ")
    }
    println("Sayilar Buyukten Kucüğe")
    val siralamaArrayList2=kisilerArrayList.sortedWith(compareByDescending{it.kisiNo})

    for( k in siralamaArrayList2){
        println("${k.kisiNo}-${k.kisiAdi} ")
     }
}