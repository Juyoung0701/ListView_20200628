package kr.co.namu.listview_20200628.adapter

import android.content.Context
import android.widget.ArrayAdapter
import kr.co.namu.listview_20200628.datas.Student

class StudentAdapter(val mContext:Context, val resId:Int, val mList:ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}