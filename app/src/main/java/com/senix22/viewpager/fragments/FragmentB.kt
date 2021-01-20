package com.senix22.viewpager.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.senix22.viewpager.CountryInfo
import com.senix22.viewpager.R
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : Fragment() {
    val name ="Швейцарія"
    val population = 8401120
    val square = 41285
    val populationDensity = population/square
    private var countryInfo: CountryInfo =
        CountryInfo(name, population, square, populationDensity)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()
        countryFragB.text = countryInfo.name
        populationFragB.text = "Населення : ${countryInfo.population}"
        squareFragB.text = "Площа: ${countryInfo.square}"
        populationDensityFragB.text = "Густота населення :${countryInfo.populationDensity}"
    }
}