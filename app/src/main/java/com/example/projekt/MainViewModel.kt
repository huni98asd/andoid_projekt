package com.example.projekt

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projekt.model.Restaurant
import com.example.projekt.repozitory.Repozitory
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.http.POST
import java.security.Policy

class MainViewModel(private  val repozitory: Repozitory): ViewModel(){

    var myResponse: MutableLiveData<Response<Restaurant>> = MutableLiveData()
    var myResponse2: MutableLiveData<Response<Restaurant>> = MutableLiveData()
    var myCustomPoints: MutableLiveData<Response<List<Restaurant>>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response:Response<Restaurant> = repozitory.getPost()
            myResponse.value = response
        }
    }

    fun getPost2(number:Int){
        viewModelScope.launch {
            val response:Response<Restaurant> = repozitory.getPost2(number)
            myResponse2.value=response
        }
    }
    fun getmyCustomPoints(userId:Int){
        viewModelScope.launch {
            val response:Response<List<Restaurant>> = repozitory.getCustomPosts(userId)
            myCustomPoints.value=response
        }
    }

}
