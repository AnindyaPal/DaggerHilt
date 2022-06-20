package com.example.daggerhilt.network

import com.example.daggerhilt.network.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPost() : List<Post>
}