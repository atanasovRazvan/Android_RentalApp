package com.example.android_rentalapp.todo.data.remote

import retrofit2.http.*
import com.example.android_rentalapp.core.Api
import com.example.android_rentalapp.todo.data.Item

object ItemApi {
    interface Service {
        @PUT("/item")
        suspend fun find(@Body token: String): List<Item>

        @GET("/item/{id}")
        suspend fun read(@Path("id") itemId: String): Item;

        @Headers("Content-Type: application/json")
        @POST("/item")
        suspend fun create(@Body item: Item): Item

        @Headers("Content-Type: application/json")
        @PUT("/item/{id}")
        suspend fun update(@Body item: Item, @Path("id") itemId: String): Item
    }

    val service: Service = Api.retrofit.create(Service::class.java)
}