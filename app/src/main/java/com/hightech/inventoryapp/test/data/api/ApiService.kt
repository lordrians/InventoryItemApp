package com.hightech.inventoryapp.test.data.api

import com.hightech.inventoryapp.test.data.remote.ResponseMovie
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ApiService {
    @GET("popular?api_key=41a6cc0ce6c185df02b0e2442b8cf782&language=en-US&page=1")
    fun getAllMovie(): Flowable<ResponseMovie>
}