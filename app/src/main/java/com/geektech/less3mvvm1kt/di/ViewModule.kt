package com.geektech.less3mvvm1kt.di

import com.geektech.less3mvvm1kt.ui.VPViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModule: Module = module { viewModel { VPViewModel() } }