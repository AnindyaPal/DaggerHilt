package com.example.daggerhilt.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.daggerhilt.network.model.Post
import com.example.daggerhilt.repo.PostRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject
constructor(private val postRepo: PostRepo) : ViewModel() {
    val response: LiveData<List<Post>> = postRepo.getPost().catch {
        e ->
        Log.e("ASd", "${e.localizedMessage}" )
    }.asLiveData()
}