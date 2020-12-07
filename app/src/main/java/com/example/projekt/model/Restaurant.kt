package com.example.projekt.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Restaurant (
        val restaurantId: Int,
        val restaurantName: String,
        val restaurantAddress: String,
        val city: String,
        val state: String,
        val area: String,
        val postalCode: Int,
        val country: String,
        val phone: Int,
        val lat: Double,
        val lng: Double,
        val price: Int,
        val reserve_url: String,
        val mobil_reserve_url: String,
        val image_url: String
        )

