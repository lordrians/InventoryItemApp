package com.hightech.inventoryapp.test.di

import com.hightech.inventoryapp.test.data.MainRepository
import com.hightech.inventoryapp.test.data.MainRepositoryImpl
import com.hightech.inventoryapp.test.data.api.ApiService
import com.hightech.inventoryapp.test.domain.MainUseCase
import com.hightech.inventoryapp.test.domain.MainUseCaseImpl
import com.hightech.inventoryapp.test.presentation.MainViewModel
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit


val networkModules = module {
    single {
        val okHttpClient = OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor().setLevel(
                HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(20L, TimeUnit.SECONDS)
            .writeTimeout(30L, TimeUnit.SECONDS)
            .readTimeout(20L, TimeUnit.SECONDS)
            .build()

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/movie/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpClient)
            .build().create(ApiService::class.java)
    }
//    single {
//        Moshi.Builder()
//            .add(KotlinJsonAdapterFactory())
//            .build()
//    }
//    single {
//         Retrofit.Builder()
//            .baseUrl("https://api.themoviedb.org/3/movie/")
//            .addConverterFactory(MoshiConverterFactory.create(get()))
//            .client(get())
//            .build().create(ApiService::class.java)
//    }
}
val repositoryModules = module {
    single<MainRepository> {
        MainRepositoryImpl(get())
    }
}
val mainUseCaseModules = module {
    single<MainUseCase> {
        MainUseCaseImpl(get())
    }
}
val mainViewModelModules = module {
    viewModel {
        MainViewModel(get())
    }
}
