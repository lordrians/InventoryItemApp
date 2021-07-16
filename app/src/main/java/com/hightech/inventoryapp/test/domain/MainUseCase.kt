package com.hightech.inventoryapp.test.domain

import com.hightech.inventoryapp.test.ResultState
import com.hightech.inventoryapp.test.data.remote.ResultsItem
import io.reactivex.rxjava3.core.Flowable

interface MainUseCase {
    fun getAllMovie(): Flowable<ResultState<List<ResultsItem>>>
}