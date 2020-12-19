package com.tugfeivecek.fragmentcalismasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tugfeivecek.fragmentcalismasi.databinding.FragmentbirinciBinding

class FragmentBirinci : Fragment() {
    private lateinit var binding: FragmentbirinciBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // false dememin sebebi baska tasarım baglamıcam


        binding = FragmentbirinciBinding.inflate(inflater)
        binding.buttonTikla.setOnClickListener {
            Toast.makeText(activity, "Button tıkla", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}