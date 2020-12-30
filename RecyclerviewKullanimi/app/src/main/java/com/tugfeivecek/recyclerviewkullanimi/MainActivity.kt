package com.tugfeivecek.recyclerviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.tugfeivecek.recyclerviewkullanimi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
     private lateinit var ulkelerList: ArrayList<Ulkeler>
     private lateinit var binding: ActivityMainBinding
     private lateinit var adapter: RVAdapter
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
          //tasarım uzerıne oturmasını sagliyo
          binding.rv.setHasFixedSize(true)
          //listenin gorunumu
         binding.rv.layoutManager=LinearLayoutManager(this)
         //binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        // binding.rv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

          val u1= Ulkeler(1,"Türkiye")
          val u2= Ulkeler(2,"İtalya")
          val u3= Ulkeler(3,"Japonya")
          val u4= Ulkeler(4,"Rusya")

          //araylist olusturma
          ulkelerList = ArrayList<Ulkeler>()
          ulkelerList.add(u1)
          ulkelerList.add(u2)
          ulkelerList.add(u3)
          ulkelerList.add(u4)

          // adapterin icine rvadapteri akatarma
          adapter= RVAdapter(this,ulkelerList)
          binding.rv.adapter=adapter

    }
}