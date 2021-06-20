package com.geektech.less3mvvm1kt.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VPAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

     val fragList = mutableListOf<Fragment>()

    override fun createFragment(position: Int): Fragment {
        return fragList[position]
    }

    override fun getItemCount(): Int {
        return fragList.size
    }
}
