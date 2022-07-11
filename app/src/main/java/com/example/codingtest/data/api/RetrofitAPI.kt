package com.example.codingtest.data.api

import com.example.codingtest.data.model.Inbox
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitAPI {

    @GET("v1/57a3ba0c-621f-4ef5-bbf1-9d54411261ed")
     suspend fun getInbox(): Response<List<Inbox>>

}