package com.hightech.inventoryapp.test.presentation

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.hightech.inventoryapp.test.domain.MainUseCase

class MainViewModel constructor( mainUseCase: MainUseCase) : ViewModel(){

    val movies = LiveDataReactiveStreams.fromPublisher(mainUseCase.getAllMovie())

}