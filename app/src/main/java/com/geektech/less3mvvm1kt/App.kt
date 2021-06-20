package com.geektech.less3mvvm1kt

import android.app.Application
import com.geektech.less3mvvm1kt.di.koinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(koinModule)
        }
    }
}