package com.tugfeivecek.navigationdrawerkullanimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.tugfeivecek.navigationdrawerkullanimi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tempFragment:Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarDrawer.title = "Navigation Drawer"
        setSupportActionBar(binding.toolbarDrawer)
        //drawer acip kapama
        val toggle = ActionBarDrawerToggle(this, binding.drawer, binding.toolbarDrawer, 0, 0)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

        //drawer baslik dinamik hale getirmek nesne olusturuldu
        val baslik= binding.navigationView.inflateHeaderView(R.layout.navigation_baslik)


        supportFragmentManager.beginTransaction().add(R.id.fragment_tutucu,FragmentBirinci()).commit()

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.nav_item_birinci) {
                Toast.makeText(applicationContext, "BİRİNCİ", Toast.LENGTH_SHORT).show()
                tempFragment = FragmentBirinci()
            }
            if (menuItem.itemId == R.id.nav_item_ikinci) {
                Toast.makeText(applicationContext, "İKİNCİ", Toast.LENGTH_SHORT).show()
                tempFragment = FragmentIkinci()
            }
            if (menuItem.itemId == R.id.nav_item_ucuncu) {
                Toast.makeText(applicationContext, "ÜÇÜNCÜ", Toast.LENGTH_SHORT).show()
                tempFragment = FragmentUcuncu()
            }
            supportFragmentManager.beginTransaction().add(R.id.fragment_tutucu,tempFragment).commit()
            binding.drawer.closeDrawer(GravityCompat.START)
            true
        }
    }

    override fun onBackPressed() {
        //nav acik mi kapali mi ona karar veriyo
        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.closeDrawer(GravityCompat.START)
        } else {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}