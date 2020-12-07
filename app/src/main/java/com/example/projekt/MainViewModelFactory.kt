package com.example.projekt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.projekt.model.Restaurant
import com.example.projekt.repozitory.Repozitory

class MainViewModelFactory(private val repozitory: Repozitory):ViewModelProvider.Factory{
    override fun<T: ViewModel?> create(modelClass: Class<T>):T{
        return MainViewModel(repozitory) as T
    }


}