package com.example.mymovieapp.api

import com.example.demotvtokyo.model.Episodes
import com.example.demotvtokyo.model.response.GetTopLIstResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("getTopList.php")
    suspend fun getTopList(
        @Query("carrier")  carrier: String?,
        @Query("terminal")  terminal: String?,
        @Query("apkv")  apkv: String?
    ): Episodes
}