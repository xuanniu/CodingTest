package com.example.codingtest.data.module

import com.example.codingtest.data.api.RetrofitAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(AppModule::class)
@Module
class AppModule {

    @Singleton
    @Provides
    fun getRetroAPI(): RetrofitAPI  {
        return Retrofit.Builder()
            .baseUrl("https://mocki.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitAPI::class.java)
    }
}