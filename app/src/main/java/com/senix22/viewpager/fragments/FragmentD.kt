package com.senix22.viewpager.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.senix22.viewpager.CountryInfo
import com.senix22.viewpager.R
import kotlinx.android.synthetic.main.fragment_c.*
import kotlinx.android.synthetic.main.fragment_c.countryFragC
import kotlinx.android.synthetic.main.fragment_c.populationDensityFragC
import kotlinx.android.synthetic.main.fragment_c.populationFragC
import kotlinx.android.synthetic.main.fragment_c.squareFragC
import kotlinx.android.synthetic.main.fragment_d.*

class FragmentD : Fragment(){
    val name ="Японія"
    val population = 127110047
    val square = 377972
    val populationDensity = population/square
    private var countryInfo: CountryInfo =
        CountryInfo(name, population, square, populationDensity)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d, container, false)
    }
    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()
        countryFragD.text = countryInfo.name
        populationFragD.text = "Населення : ${countryInfo.population}"
        squareFragD.text = "Площа: ${countryInfo.square}"
        populationDensityFragD.text = "Густота населення :${countryInfo.populationDensity}"
    }
}