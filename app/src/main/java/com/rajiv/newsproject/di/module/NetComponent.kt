package com.rajiv.newsproject.di.module

import com.rajiv.newsproject.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetworkModule::class))
interface NetComponent {
    fun inject(activity: MainActivity)
}