package com.example.codingtest.data.model

data class Inbox (
    val id: Int?,
    val emailShortDesc: String,
    val fromDate: Long?,
    val priorityIndicator: Boolean?,
    val readIndicator: Boolean?
)