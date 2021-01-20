package com.senix22.viewpager

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewPager2WithFragments()
    }

    private fun initViewPager2WithFragments()
    {
        val viewPager2:ViewPager2 = findViewById(R.id.viewpager)
        val adapter = ExampleStateAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter = adapter

        val tablayout: TabLayout = findViewById(R.id.tablayout)
        val names:Array<String> = arrayOf("Україна","Швейцарія","Канада","Японія")
        TabLayoutMediator(tablayout,viewPager2){tab, position  ->
            tab.text = names[position]
        }.attach()
    }
}