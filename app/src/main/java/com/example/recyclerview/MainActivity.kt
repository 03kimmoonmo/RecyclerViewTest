package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data:MutableList<ListData> = setData() //return된 list를 data변수에 저장함
        var adapter = CustomAdapter() //CustomAdapter()를 저장하는 adapter 변수 생성
        adapter.listData = data // CustomAdapter에 선언한 listData 변수에 data변수 전달
        recyclerView.adapter = adapter // 성성한 recyclerview의 adapter에 adapter변수 저장
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun setData(): MutableList<ListData>{
        var data:MutableList<ListData> = mutableListOf()
        for(num in 1..10){
            var title = "${num}번째 타이틀"
            var listdata = ListData(num, title)
            data.add(listdata)//for문으로 생성된 데이터를 list에 add
        }
        return data //다 만들어진 후 return
    }
}