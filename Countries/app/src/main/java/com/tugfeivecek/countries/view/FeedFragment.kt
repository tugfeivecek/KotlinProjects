package com.tugfeivecek.countries.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugfeivecek.countries.adapter.CountryAdapter
import com.tugfeivecek.countries.databinding.FragmentFeedBinding

import com.tugfeivecek.countries.viewmodel.FeedViewModel


class FeedFragment : Fragment() {
    private lateinit var binding: FragmentFeedBinding
    private val countryAdapter = CountryAdapter(arrayListOf())
    private lateinit var viewModel: FeedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // val test = Country()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFeedBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //provider hangi viewmodelde calisicam hangi fragmentdayiz hangi activiydeyiz bunu belirtmek icin
        viewModel = ViewModelProviders.of(this).get(FeedViewModel::class.java)
        // mutablelivbe datalara veri ekleniyo guncelleniyo
        viewModel.refreshFromAPI()
        //recylierview gorunumu
        binding.countryList.layoutManager = LinearLayoutManager(context)
        binding.countryList.adapter = countryAdapter

        //REFRESHLAYOUT calistirma

        binding.swipeRefreshLayout.setOnRefreshListener {
            binding.countryList.visibility=View.GONE
            binding.countryError.visibility=View.GONE
            //kendi loadingimi gosterme
            binding.countryLoading.visibility=View.VISIBLE
            //var olanı kaldirma
            viewModel.refreshData()
            binding.swipeRefreshLayout.isRefreshing = false
        }
        //verileri gozlemlemek icin
        observeLiveData()

        /*   binding.button.setOnClickListener {
               val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment()
               Navigation.findNavController(it).navigate(action)
           } */
    }

    //olusturdugumuz livedatalari kontrol etmek
    private fun observeLiveData() {
        //lifecylecowner kim
        //observeı lamba gosterimi ile yapmamız gerekiyor counyrlistin icinde countyr modeli,n icinde bulunacagı belli
        viewModel.countries.observe(viewLifecycleOwner, Observer { countries ->
            countries?.let {
                //listemi cekicem yeni halini koyucam
                binding.countryList.visibility = View.VISIBLE
                countryAdapter.updateCountryList(countries)

//                val myString ="James"
//                myString.myExtension("Hetfield")
            }
        })
        //hata mesajı eror varmı yokmu onu kontrol edicem if(it) true ise anlamıma geliyor
        viewModel.countryError.observe(viewLifecycleOwner, Observer { error ->
            error?.let {
                if (it) {
                    binding.countryError.visibility = View.VISIBLE
                } else {
                    //gone gosterme
                    binding.countryError.visibility = View.GONE

                }
            }
        })
        //yukleniyormu
        viewModel.countryLoading.observe(viewLifecycleOwner, Observer { loading ->
            loading?.let {
                if (it) {
                    binding.countryLoading.visibility = View.VISIBLE
                    binding.countryList.visibility = View.GONE
                    binding.countryError.visibility = View.GONE
                } else {
                    binding.countryLoading.visibility = View.GONE
                }
            }
        })
    }
}




