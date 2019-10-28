package com.rajiv.newsproject.model

import androidx.annotation.Keep

@Keep
data class News (
        val status : String,
        val totalResults : Int,
        val articles : List<Article>
)