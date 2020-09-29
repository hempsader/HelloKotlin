package com.example.hellokotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForecastAdapter(val items: List<String>): RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {



    class ViewHolder(itemView: TextView) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastAdapter.ViewHolder =
        ViewHolder(TextView(parent.context))


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ForecastAdapter.ViewHolder, position: Int) {

    }
}