package com.example.mymovieapp.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "https://txbiz.tv-tokyo.co.jp/apiv3/"

    private val getRetrofit: Retrofit
        get() {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build()
        }

    val apiService: ApiService by lazy {
        getRetrofit.create(ApiService::class.java)
    }

}