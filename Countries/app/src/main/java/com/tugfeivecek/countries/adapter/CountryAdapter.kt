package com.tugfeivecek.countries.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.tugfeivecek.countries.R
import com.tugfeivecek.countries.databinding.ItemCountryBinding

import com.tugfeivecek.countries.model.Country
import com.tugfeivecek.countries.view.FeedFragmentDirections

class CountryAdapter(val countryList: ArrayList<Country>) :


    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(), CountryClickListener {
    private lateinit var binding: CountryAdapter

    inner class CountryViewHolder(var view: ItemCountryBinding) :
        RecyclerView.ViewHolder(view.root) {

        /*  var imageViewCountry: ImageView
          var textViewCountryName: TextView
          var textViewCountryRegion: TextView

          init {
              imageViewCountry = view.findViewById(R.id.imageView)
              textViewCountryName = view.findViewById(R.id.name)
              textViewCountryRegion = view.findViewById(R.id.region)
          }*/
    }

    //layout ile adapteri baglamak countyrviewholder donduruyoruz
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        // Layout ile adaptörün birbirine bağlandığı yer

        val inflater = LayoutInflater.from(parent.context)
        //val view = inflater.inflate(R.layout.item_country, parent, false)
        //data binding direk bagla
        val view = DataBindingUtil.inflate<ItemCountryBinding>(
            inflater,
            R.layout.item_country,
            parent,
            false
        )
        return CountryViewHolder(view)
    }


    //kac row
    override fun getItemCount(): Int {
        return countryList.size

    }

    //layoutta idlere ulasmak
    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        // kullanılan layouttaki itemler'a ulaşabilmemizi sağlar
        // val country = countryList[position]

        holder.view.country = countryList[position]

        /* holder.textViewCountryName.text = country.countryName
         holder.textViewCountryRegion.text = country.countryRegion
         holder.view.setOnClickListener {
             val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment()
             Navigation.findNavController(it).navigate(action)
         }

         holder.imageViewCountry.downloadFromUrl(
             country.url!!,
             placeHolderProgressBar(holder.view.context)
         )*/
    }


    // liste icinde countryleri tuttugum list
    //sayfa yenilendiginde yeni gelen verileri almak icin
    fun updateCountryList(newCountryList: List<Country>) {
        //once listeyi bosalt collection icerisindeki verileri eklicem
        countryList.clear()
        countryList.addAll(newCountryList)
        //adapteri yenilemek
        notifyDataSetChanged()
    }

    override fun onCountryClicked(v: View) {
        /*   val uuid = v.countryUuidText.text.toString().toInt()
            val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment(uuid)
            //action.countryUuid
            Navigation.findNavController(v).navigate(action) */

    }
}