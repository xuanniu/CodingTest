package com.example.codingtest.data.repository

import com.example.codingtest.data.api.RetrofitAPI
import com.example.codingtest.data.model.Inbox
import retrofit2.Response

class RetrofitRepository(val retro: RetrofitAPI) {
    fun getInbox(): Response<List<Inbox>> {
        return retro.getInbox()
    }

}