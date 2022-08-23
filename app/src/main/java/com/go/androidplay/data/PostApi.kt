package com.go.androidplay.data

import android.content.Context
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.go.androidplay.model.Post
import com.google.gson.JsonArray
import org.json.JSONObject

class PostApi(context: Context) {

    companion object{
        var instance: PostApi? = null

        fun getInstance(context:Context): PostApi {
            if(instance == null){
                instance = PostApi(context)
            }

            return instance!!
        }
    }


    val requestQueue : RequestQueue = Volley.newRequestQueue(context)

    fun getALlPosts() {
        var request: JsonObjectRequest = JsonObjectRequest(
            "https://jsonplaceholder.typicode.com/posts", ResponseListener(), ErrorListener())
        requestQueue.add(request)
    }
}

private class ResponseListener : Response.Listener<JSONObject> {
    override fun onResponse(response: JSONObject?) {
        TODO("Not yet implemented")
    }
}

private class ErrorListener(): Response.ErrorListener {
    override fun onErrorResponse(error: VolleyError?) {
        print(error)
    }
}