package com.tugfeivecek.tablayoutkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.tugfeivecek.tablayoutkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val fragmentListesi =ArrayList<Fragment>()
    private val fragmentBaslikListesi =ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentListesi.add(FragmentBirinci())
        fragmentListesi.add(FragmentIkinci())
        fragmentListesi.add(FragmentUcuncu())

        val adapter =MyViewPagerAdapter(this)
        //viewpager icine adapter aktarma
        binding.viewpager2.adapter=adapter
        fragmentBaslikListesi.add("Bir")
        fragmentBaslikListesi.add("İki")
        fragmentBaslikListesi.add("Üçüncü")

        //viewpager tablayout birlestirme   // her tab her position
        TabLayoutMediator(binding.tablayout,binding.viewpager2) { tab, position ->
            // sirayla fragmentlara basligi yazicak
            tab.setText(fragmentBaslikListesi[position])
        }.attach()

        //iconu istedigimiz taba ekleme
        //!! iconu  null olmadıgını gosterir istedigimiz taba ekleme
        binding.tablayout.getTabAt(0)!!.setIcon(R.drawable.music)
    }

    inner class MyViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
           return  fragmentListesi.size
        }

        // sirayla fragmentlari belirlememiz lazım poisitionşa indekslere eris
        override fun createFragment(position: Int): Fragment {
            return fragmentListesi[position]
        }
    }
}