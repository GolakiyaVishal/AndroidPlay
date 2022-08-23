package com.go.androidplay.data

import android.content.Context
import com.go.androidplay.model.Post

class Repository(context: Context, private val postApi: PostApi) {

    fun getAllPosts() {
        postApi.getALlPosts()
    }
}