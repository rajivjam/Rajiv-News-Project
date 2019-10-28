package com.rajiv.newsproject.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.rajiv.newsproject.base.BaseViewModel
import com.rajiv.newsproject.model.Article
import com.rajiv.newsproject.model.News
import com.rajiv.newsproject.service.NewsServiceApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivityViewModel(application: Application) : BaseViewModel(application) {
    @Inject
    lateinit var newsServiceApi: NewsServiceApi
    private val apiKey = "aba316dfdc8746d58065e6d492d6659f"

    internal var mutableLiveData: MutableLiveData<List<Article>>? = null

    val allArticle: MutableLiveData<List<Article>>?
        get() = getMutableLiveData()

    private val newsApiKey = String.format("top-headlines?country=us&category=entertainment&apiKey=$apiKey")

    private fun getMutableLiveData(): MutableLiveData<List<Article>>? {
        if (mutableLiveData == null) {
            mutableLiveData = MutableLiveData()
        }
        newsServiceApi.getAllNews(newsApiKey)
            .enqueue(object : Callback<News> {
                override fun onResponse(call: Call<News>, response: Response<News>) {
                    if (response.isSuccessful) {
                        val newsRes = response.body()
                        val articleList = newsRes?.articles
                        mutableLiveData?.setValue(articleList)
                    }
                }
                override fun onFailure(call: Call<News>, t: Throwable) {}
            })
        return mutableLiveData
    }

    companion object {
        const val BASE_URL = "https://newsapi.org/v2/"
    }
}
