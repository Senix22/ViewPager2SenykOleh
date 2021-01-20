package com.senix22.viewpager.fragments

import android.annotation.SuppressLint
import android.app.Person
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.senix22.viewpager.CountryInfo
import com.senix22.viewpager.R
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment() {
    val name ="Україна"
    val population = 41703300
    val square = 603548
    val populationDensity = population/square
    private var countryInfo: CountryInfo = CountryInfo(name, population, square, populationDensity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)

    }

    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()
        countryFragA.text = countryInfo.name
        populationFragA.text = "Населення : ${countryInfo.population}"
        squareFragA.text = "Площа: ${countryInfo.square}"
        populationDensityFragA.text = "Густота населення :${countryInfo.populationDensity}"
    }
}