package com.senix22.viewpager.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.senix22.viewpager.CountryInfo
import com.senix22.viewpager.R
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_b.countryFragB
import kotlinx.android.synthetic.main.fragment_b.populationDensityFragB
import kotlinx.android.synthetic.main.fragment_b.populationFragB
import kotlinx.android.synthetic.main.fragment_b.squareFragB
import kotlinx.android.synthetic.main.fragment_c.*

class FragmentC : Fragment(){
    val name = "Канада"
    val population = 37067011
    val square = 998467
    val populationDensity = population/square
    private var countryInfo: CountryInfo =
        CountryInfo(name, population, square, populationDensity)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }
    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()
        countryFragC.text = countryInfo.name
        populationFragC.text = "Населення : ${countryInfo.population}"
        squareFragC.text = "Площа: ${countryInfo.square}"
        populationDensityFragC.text = "Густота населення :${countryInfo.populationDensity}"
    }
}