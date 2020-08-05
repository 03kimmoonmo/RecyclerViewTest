package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class CustomAdapter : RecyclerView.Adapter<Holder>(){
    var listData = mutableListOf<ListData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent, false) //레이아웃 생성
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return listData.size// 리스트 아이템 수
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val data = ListData.get(position)
        holder.setListData(data)
    }
}
class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun setListData(listData: ListData){
        itemView.id_number.text ="${listData.number}"
        itemView.text_title.text = listData.title
    }
}