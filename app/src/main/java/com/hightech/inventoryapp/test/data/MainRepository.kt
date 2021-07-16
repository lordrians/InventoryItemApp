package com.hightech.inventoryapp.test.data

import com.hightech.inventoryapp.test.ResultState
import com.hightech.inventoryapp.test.data.remote.ResultsItem
import io.reactivex.rxjava3.core.Flowable

interface MainRepository {
    fun getAllMovie(): Flowable<ResultState<List<ResultsItem>>>
}