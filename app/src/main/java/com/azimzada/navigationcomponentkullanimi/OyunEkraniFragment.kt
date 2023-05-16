package com.azimzada.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class OyunEkraniFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false)
        tasarim.findViewById<Button>(R.id.btnBitir).setOnClickListener()
        {
            Navigation.findNavController(it).navigate(R.id.SonucEkraninaKecis)
        }
        return tasarim
    }


}