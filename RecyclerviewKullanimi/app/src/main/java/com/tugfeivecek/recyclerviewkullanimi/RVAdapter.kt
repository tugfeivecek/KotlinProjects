package com.tugfeivecek.recyclerviewkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

//adaptorun hangı aktıvıtde calıstıgını gormek ıcın mContent, list yazarken daha kapsamlı olur hem arraylist hemde list kullanabılırz
class RVAdapter(private val mContent: Context, private val ulkelerDisaridanGelenListe: List<Ulkeler>) : RecyclerView.Adapter<RVAdapter.CardViewNesneleriniTutucu>() {
    // ic sınıf card tasarimdaki gorsel nesnelere erismek icim

    // bu nesne sayesınde tasarım uzerındekı nesnelere erısıcez

    inner class CardViewNesneleriniTutucu(view: View) : RecyclerView.ViewHolder(view) {

        var satirCardView: CardView
        var satirYazi: TextView
        var noktaResim: ImageView

        //initte tasarımda yer alan görsel nesneleri
        //eşleştirmeyi sağlıyor
        init {
            satirCardView = view.findViewById(R.id.satirCardView)
            satirYazi = view.findViewById(R.id.satirYazi)
            noktaResim = view.findViewById(R.id.noktaResim)
        }

    }

    //Hangi layoutun adapteri olucak onu tasarlıyoruz
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewNesneleriniTutucu {
        //tasrımı tanımlayıp aktarmamız gerek
        val tasarim = LayoutInflater.from(mContent).inflate(R.layout.card_tasarimi, parent, false)
        return CardViewNesneleriniTutucu(tasarim)
    }

    //eristigin nesneler uzerinde degisiklik yapmanı sagliyo
    override fun onBindViewHolder(holder: CardViewNesneleriniTutucu, position: Int) {
        // position sırayla calısır
        val ulke = ulkelerDisaridanGelenListe[position]
        holder.satirYazi.text = ulke.ulkeAdi

        holder.satirCardView.setOnClickListener {
            Toast.makeText(mContent, "Ulke : ${ulke.ulkeAdi}", Toast.LENGTH_SHORT).show()
        }

        //Popup Menu olusturma
        holder.noktaResim.setOnClickListener {
            val popup = PopupMenu(mContent,holder.noktaResim)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()
                 // popup itemlarına işlem yaptırma
            popup.setOnMenuItemClickListener { item ->
                when( item.itemId){

                    R.id.action_sil->{
                        Toast.makeText(mContent, "Sil : ${ulke.ulkeAdi}", Toast.LENGTH_SHORT).show()
                       true
                    }
                    R.id.action_duzenle -> {
                        Toast.makeText(mContent, "Düzenle : ${ulke.ulkeAdi}", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
        }
    }

    //kac tane satır verı olucak
    override fun getItemCount(): Int {

        return ulkelerDisaridanGelenListe.size
    }
}