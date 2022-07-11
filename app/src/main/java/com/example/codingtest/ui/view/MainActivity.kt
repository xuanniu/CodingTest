package com.example.codingtest.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.codingtest.R
import com.example.codingtest.ui.viewmodel.InboxViewModel
import dagger.hilt.EntryPoint
import javax.inject.Inject

@EntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var vm: InboxViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}