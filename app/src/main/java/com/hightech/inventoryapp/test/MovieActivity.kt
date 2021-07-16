package com.hightech.inventoryapp.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hightech.InventoryItemapp.R
import com.hightech.inventoryapp.presentation.InventoryViewModel
import com.hightech.inventoryapp.test.presentation.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieActivity : AppCompatActivity() {

    private val mainViewModel: InventoryViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

//        mainViewModel.movies.observe(this,{
//            when (it){
//                is ResultState.InProgress -> {}
//                is ResultState.Success -> {
//                    Log.i("ActivityMain", "onCreate: ${it.data}")
//                }
//                is ResultState.Done -> {}
//                is ResultState.Error -> {}
//            }
//        })

    }

}