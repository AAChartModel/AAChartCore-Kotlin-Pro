package com.aachartmodel.aainfographics_pro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aachartmodel.aainfographics_pro.R

class ChartTypesRecyclerViewAdapter(private val dataList: Array<String>) : RecyclerView.Adapter<ProChartTypesRecyclerViewHolder>() {
    interface OnItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

    private var onItemClickListener: OnItemClickListener? = null
    fun setItemOnClickListener(onItemClickListener: OnItemClickListener?) {
        this.onItemClickListener = onItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProChartTypesRecyclerViewHolder {
        return ProChartTypesRecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_chart_types_recycler_view, parent, false))
    }

    override fun onBindViewHolder(holder: ProChartTypesRecyclerViewHolder, position: Int) {
        val chartTypeName = dataList[position]
        holder.tv1.setText(chartTypeName)
        //通过为条目设置点击事件触发回调
        if (onItemClickListener != null) {
            holder.itemView.setOnClickListener(View.OnClickListener { view -> onItemClickListener!!.onItemClick(view, position) })
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}

