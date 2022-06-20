package com.example.daggerhilt.repo

import com.example.daggerhilt.network.ApiService
import com.example.daggerhilt.network.ServiceImpl
import com.example.daggerhilt.network.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow
import javax.inject.Inject

class PostRepo @Inject constructor(private val serviceImplementation: ServiceImpl) {

    //using flow to handle asynchorounosly
    fun getPost(): kotlinx.coroutines.flow.Flow<List<Post>> = flow {
        val response = serviceImplementation.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)

}