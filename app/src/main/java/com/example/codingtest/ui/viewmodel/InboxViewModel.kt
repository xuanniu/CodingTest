package com.example.codingtest.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.codingtest.data.model.Inbox
import com.example.codingtest.data.repository.RetrofitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class InboxViewModel @Inject constructor(val repo: RetrofitRepository): ViewModel() {

    var inboxList = MutableLiveData<List<Inbox>>()

    fun getInbox() {
        val res = repo.getInbox()
        if (res.isSuccessful) {
            inboxList.postValue(res.body())
        }
    }

}