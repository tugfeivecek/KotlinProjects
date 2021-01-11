package com.tugfeivecek.countries.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.tugfeivecek.countries.R
import com.tugfeivecek.countries.view.CountryFragmentArgs
import com.tugfeivecek.countries.databinding.FragmentCountryBinding
import com.tugfeivecek.countries.util.dowloadFromUrl
import com.tugfeivecek.countries.util.placeholderProgressBar
import com.tugfeivecek.countries.viewmodel.CountryViewModel


class CountryFragment : Fragment() {
    private lateinit var viewModel :CountryViewModel
    private var countryUuid = 0
    private lateinit var dataBinding: FragmentCountryBinding
    private lateinit var binding: FragmentCountryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBinding.inflate(layoutInflater)
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_country,container,false)
        // Inflate the layout for this fragment
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            countryUuid = CountryFragmentArgs.fromBundle(it).countryUuid
        }
        viewModel= ViewModelProviders.of(this).get(CountryViewModel ::class.java)
        viewModel.getDataFromRoom(countryUuid)


        observeLiveData()
    }
        private fun observeLiveData(){
            viewModel.countryLiveData.observe(viewLifecycleOwner, Observer{
                country -> country?.let {
                //databinding
                dataBinding.selectedCountry =country
              /*  binding.countryName.text = country.countryName
                binding.countryCapital.text = country.countryCapital
                binding.countryCurrency.text = country.countryCurrency
                binding.countryLanguage.text = country.countryLanguage
                binding.countryRegion.text = country.countryRegion
                context?.let {
                    binding.countryImage.dowloadFromUrl(
                        country.imageUrl,
                        placeholderProgressBar(it))
                }*/
            }
})
}
}