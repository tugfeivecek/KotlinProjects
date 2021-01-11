package com.tugfeivecek.countries.util

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tugfeivecek.countries.R

//Extension
//hangi sınıfa eklenti yapicaksak onu yaziyoruz
/*fun String.myExtension(myParameter: String) {
  println(myParameter)
}             */
fun ImageView.dowloadFromUrl(url: String?, progressDrawable: CircularProgressDrawable) {
    //gorselde hata varsa gorsel gelene kadar ne vericez
    val options = RequestOptions().placeholder(progressDrawable)
        .error(R.drawable.ic_launcher_background)     //error olursa ne olucak
    //nerdeyiz belirtmek icin urlyi veircez
    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(url)
        .into(this)
}

//Hat yerine gelicek resmi ayarlamak
fun placeholderProgressBar(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        //ne kadar kalınlıkta ve yarıcapi kac
        strokeWidth = 8f
        centerRadius = 40f
        start()

    }
}
@BindingAdapter("android:downloadurl")
fun downloadImage(view:ImageView,url:String?) {
    view.dowloadFromUrl(url, placeholderProgressBar(view.context))

}