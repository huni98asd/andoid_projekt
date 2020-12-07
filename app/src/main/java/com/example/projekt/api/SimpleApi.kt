package com.example.projekt.api

import com.example.projekt.model.Restaurant
import retrofit2.Response
import retrofit2.http.*
import java.lang.NumberFormatException


interface SimpleApi {
    @GET("restaurants?city=Boston")
    suspend fun getPost():Response<Restaurant>

    @GET("restaurants/")
    suspend fun getPost2(
        @Path("postNumber{postNumber}")number:Int
    ):Response<Restaurant>

    @GET("restaurants")
    suspend fun getCustomPost(
        @Query("userId")userId:Int
    ):Response<List<Restaurant>>

    @GET("restaurants")
    suspend fun getCustomPosts2(
        @Query("userId")userId: Int,
        @QueryMap options: Map<String,String>
    )

}


