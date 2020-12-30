package com.tugfeivecek.bottomnavigationviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tugfeivecek.bottomnavigationviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tempFragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_tutucu,FragmentBirinci()).commit()
        //menudei itemlara tiklanma ozelligi
        binding.bottomNavigation.setOnNavigationItemReselectedListener {
            menuItem->
            if(menuItem.itemId == R.id.action_home){
                Toast.makeText(applicationContext,"Menü tıklandı",Toast.LENGTH_SHORT).show()
                tempFragment=FragmentBirinci()
            }
            if(menuItem.itemId == R.id.action_search){
                Toast.makeText(applicationContext,"Search tıklandı",Toast.LENGTH_SHORT).show()
                tempFragment=FragmentIkinci()
            }
            if(menuItem.itemId == R.id.action_profil){
                Toast.makeText(applicationContext,"Profil tıklandı",Toast.LENGTH_SHORT).show()
                tempFragment=FragmentUcuncu()
            }
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_tutucu,tempFragment).commit()
            true
        }

    }
}