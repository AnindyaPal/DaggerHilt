package com.example.daggerhilt.network

import com.example.daggerhilt.network.model.Post
import javax.inject.Inject

class ServiceImpl @Inject constructor(private val apiService: ApiService) {
    suspend fun getPost():List<Post> = apiService.getPost();
}