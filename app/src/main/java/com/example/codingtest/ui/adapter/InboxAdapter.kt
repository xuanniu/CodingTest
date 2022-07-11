package com.example.codingtest.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.codingtest.R
import com.example.codingtest.data.model.Inbox
import java.text.SimpleDateFormat
import java.util.*

class InboxAdapter(val inboxList: List<Inbox>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.inbox_cards, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.description.text = inboxList[position].emailShortDesc
        val dateFormat = SimpleDateFormat("yyyy.MM.dd HH:mm")
        var date = Date(0)
        inboxList[position].fromDate?.let {
            date = Date(it)
        }
        val formattedDate = dateFormat.format(date)
        holder.date.text = formattedDate
    }

    override fun getItemCount(): Int {
        return inboxList.size
    }

}

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val description : TextView = view.findViewById(R.id.description)
    val date : TextView = view.findViewById(R.id.date)

}