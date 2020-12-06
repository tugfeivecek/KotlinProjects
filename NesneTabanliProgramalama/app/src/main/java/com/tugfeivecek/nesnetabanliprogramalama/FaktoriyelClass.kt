package com.tugfeivecek.nesnetabanliprogramalama

class FaktoriyelClass {


  fun faktorıyelHesaplama(sayi:Int):Int{
      var sonuc=1
      for(i in 1..sayi){
          sonuc=sonuc*i

      }
      return sonuc
  }
}