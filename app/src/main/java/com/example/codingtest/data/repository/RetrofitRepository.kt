package com.example.codingtest.data.repository

import com.example.codingtest.data.api.RetrofitAPI
import com.example.codingtest.data.model.Inbox
import retrofit2.Response
import javax.inject.Inject

class RetrofitRepository @Inject constructor(val retro: RetrofitAPI) {
    suspend fun getInbox(): Response<List<Inbox>> {
        return retro.getInbox()
    }

}