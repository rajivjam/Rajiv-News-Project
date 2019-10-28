package com.rajiv.newsproject.service

import com.rajiv.newsproject.model.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface NewsServiceApi {
    @GET
    fun getAllNews(@Url urlString: String): Call<News>
}
