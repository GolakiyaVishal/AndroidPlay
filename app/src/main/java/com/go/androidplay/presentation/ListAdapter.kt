package com.go.androidplay.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.go.androidplay.R
import com.go.androidplay.viewmodel.ItemClickInterface

class RecyclerItemListAdapter : RecyclerView.Adapter<RecyclerItemListAdapter.ListItemViewHolder>() {

    private lateinit var onItemClick: ItemClickInterface

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_adaptar_view, parent, false)
        return ListItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.index.text = "$position"
        holder.label.text = "label"
        holder.itemLayout.setOnClickListener { _ ->  onItemClick.onClick()}
    }

    override fun getItemCount(): Int {
        return 4
    }

    fun setOnItemClickListener(onItemClickInterface: ItemClickInterface){
        this.onItemClick = onItemClickInterface
    }

    inner class ListItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var label: TextView = itemView.findViewById(R.id.tvListName)
        var index: TextView = itemView.findViewById(R.id.tvListId)
        var itemLayout: LinearLayout = itemView.findViewById(R.id.llItemLayout)
    }

}
