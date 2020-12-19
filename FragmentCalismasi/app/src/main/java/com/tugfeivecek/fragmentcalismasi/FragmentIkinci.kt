package com.tugfeivecek.fragmentcalismasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentIkinci :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // false dememin sebebi baska tasarım bglamıcam
        val rootView=inflater.inflate(R.layout.fragmentikinci,container,false)

        return rootView
    }
}