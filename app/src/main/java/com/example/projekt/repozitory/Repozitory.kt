package com.example.projekt.repozitory

import  com.example.projekt.api.RetrofitInstance
import com.example.projekt.model.Restaurant
import retrofit2.Response
import retrofit2.http.POST

class Repozitory {
    suspend fun getPost(): Response<Restaurant> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number:Int): Response<Restaurant> {
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId:Int):Response<List<Restaurant>>{
        return RetrofitInstance.api.getCustomPost(userId)
    }


}