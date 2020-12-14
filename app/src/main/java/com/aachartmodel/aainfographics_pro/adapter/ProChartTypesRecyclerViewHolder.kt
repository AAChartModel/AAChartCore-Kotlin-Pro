package com.aachartmodel.aainfographics_pro.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aachartmodel.aainfographics_pro.R

class ProChartTypesRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tv1: TextView

    init {
        tv1 = itemView.findViewById(R.id.tv1)
    }
}