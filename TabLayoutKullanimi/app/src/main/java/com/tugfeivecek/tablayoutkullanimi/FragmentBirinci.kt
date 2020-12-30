package com.tugfeivecek.tablayoutkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentBirinci : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //gorsel tasarımla yazilimsal tasarimi birlestir
        return inflater.inflate(R.layout.fragment_birinci_layout,container,false)
    }
}