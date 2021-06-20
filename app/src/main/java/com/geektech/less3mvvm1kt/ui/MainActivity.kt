package com.geektech.less3mvvm1kt.ui

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.geektech.less3mvvm1kt.R
import com.geektech.less3mvvm1kt.databinding.ActivityMainBinding
import com.geektech.less3mvvm1kt.ui.fragments.FirstFragment
import com.geektech.less3mvvm1kt.ui.fragments.SecondFragment
import com.geektech.less3mvvm1kt.ui.fragments.ThirdFragment


class MainActivity : AppCompatActivity() {

    private lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        val adapter = VPAdapter(this)
        val fragList = listOf(FirstFragment(), SecondFragment(), ThirdFragment())
        adapter.fragList.addAll(fragList)
        ui.viewPager2.adapter = adapter

        when (ui.viewPager2.currentItem) {
            0 -> {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.statusBarColor = ContextCompat.getColor(this, R.color.darker_grey)
            }
            1 -> {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.statusBarColor = ContextCompat.getColor(this, R.color.orange_light)
            }
            2 -> {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.statusBarColor = ContextCompat.getColor(this, R.color.green_dark)
            }
        }
    }
}