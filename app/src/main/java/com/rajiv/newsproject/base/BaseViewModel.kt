package com.rajiv.newsproject.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.rajiv.newsproject.di.component.DaggerViewModelInjector
import com.rajiv.newsproject.di.component.ViewModelInjector
import com.rajiv.newsproject.di.module.NetworkModule
import com.rajiv.newsproject.viewmodel.MainActivityViewModel

abstract class BaseViewModel(application: Application): AndroidViewModel(application){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is MainActivityViewModel -> injector.inject(this)
        }
    }
}