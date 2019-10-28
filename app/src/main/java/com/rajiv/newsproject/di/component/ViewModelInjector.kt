package com.rajiv.newsproject.di.component

import com.rajiv.newsproject.di.module.NetworkModule
import com.rajiv.newsproject.viewmodel.MainActivityViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(mainActivityViewModel: MainActivityViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector
        fun networkModule(networkModule: NetworkModule): Builder
    }
}