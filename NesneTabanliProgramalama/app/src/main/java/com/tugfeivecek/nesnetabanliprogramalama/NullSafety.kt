package com.tugfeivecek.nesnetabanliprogramalama

fun main(){

    var str1:String? =null
    str1?.trim()   //null bir ifadeyi trim yapmak istersek normalde hata verır ama burda vermez
    // Tanımlandıktan sonra kullanılırken ? işareti kullanılırsa null hatasından kaynaklı olabilecek cokmelerden korunur.
    // Tanımlandıktan sonra kullanılırken !! işareti kullanılırsa bu değişkenin null olabileceğini belirtmiş oluruz. str1!!.trim()

}