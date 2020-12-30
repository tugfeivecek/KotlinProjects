package com.tugfeivecek.toolbararamaozelligi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.SearchView

import com.tugfeivecek.toolbararamaozelligi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.title="Arama"
        setSupportActionBar(binding.toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_arama,menu)
        val item = menu.findItem(R.id.action_ara)
        val searchView =item.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        Log.e("onQueryTextSubmit",query.toString())
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        Log.e("onQueryTextChange",newText.toString())
        return true
    }
}