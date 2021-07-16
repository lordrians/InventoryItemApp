package com.hightech.inventoryapp

import android.app.Application
import com.hightech.data.di.databaseModule
import com.hightech.data.di.repositoryModule
import com.hightech.domain.di.useCaseModule
import com.hightech.inventoryapp.presentation.di.viewModelModule
import com.hightech.inventoryapp.test.di.mainUseCaseModules
import com.hightech.inventoryapp.test.di.mainViewModelModules
import com.hightech.inventoryapp.test.di.networkModules
import com.hightech.inventoryapp.test.di.repositoryModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(
                listOf(
                    networkModules,
                    repositoryModules,
                    mainUseCaseModules,
                    mainViewModelModules,
                    databaseModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule,
                )
            )
        }
    }
}