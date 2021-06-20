package com.geektech.less3mvvm1kt.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.less3mvvm1kt.databinding.FragmentSecondBinding
import com.geektech.less3mvvm1kt.ui.VPViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : Fragment() {

    private lateinit var ui: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ui = FragmentSecondBinding.inflate(inflater, container, false)

        if (isAdded) {
            val viewModel: VPViewModel by requireActivity().viewModel()
            viewModel.counterLD.observe(viewLifecycleOwner, {
                ui.textView2.text = it.toString()
            })
        }

        return ui.root
    }

}