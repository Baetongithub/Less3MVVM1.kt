package com.geektech.less3mvvm1kt.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geektech.less3mvvm1kt.databinding.FragmentFirstBinding
import com.geektech.less3mvvm1kt.ui.VPViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstFragment : Fragment() {

    private lateinit var ui: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ui = FragmentFirstBinding.inflate(inflater, container, false)

        if (isAdded){
            val viewModel: VPViewModel by requireActivity().viewModel()
            ui.buttonAdd.setOnClickListener { viewModel.onAdditionCLick() }
            ui.buttonSubtract.setOnClickListener { viewModel.onSubtractCLick() }
        }

        return ui.root
    }
}