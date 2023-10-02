package com.example.simplemorty

import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyService {

    @GET("character/1")
    fun getCharacterById(): Call<Any>
}