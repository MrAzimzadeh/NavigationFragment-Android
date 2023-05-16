package com.azimzada.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.azimzada.navigationcomponentkullanimi.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {

    lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
        tasarim.findViewById<Button>(R.id.btnBasla).setOnClickListener()
        {
            Navigation.findNavController(it).navigate(R.id.oyunEkraninaKecis)
        }
        return tasarim
    }


}