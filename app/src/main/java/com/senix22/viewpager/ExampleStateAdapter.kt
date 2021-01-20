package com.senix22.viewpager

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.senix22.viewpager.fragments.FragmentA
import com.senix22.viewpager.fragments.FragmentB
import com.senix22.viewpager.fragments.FragmentC
import com.senix22.viewpager.fragments.FragmentD

class ExampleStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    val fragments:ArrayList<Fragment> = arrayListOf(
        FragmentA(),
        FragmentB(),
        FragmentC(),
        FragmentD()
    )


    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}