package com.hightech.inventoryapp.test.domain

import com.hightech.inventoryapp.test.ResultState
import com.hightech.inventoryapp.test.data.MainRepository
import com.hightech.inventoryapp.test.data.remote.ResultsItem
import io.reactivex.rxjava3.core.Flowable

class MainUseCaseImpl constructor(
    private val repository: MainRepository
): MainUseCase {
    override fun getAllMovie(): Flowable<ResultState<List<ResultsItem>>> {
        return repository.getAllMovie()
    }
}