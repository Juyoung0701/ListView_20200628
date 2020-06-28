package kr.co.namu.listview_20200628.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.namu.listview_20200628.R
import kr.co.namu.listview_20200628.datas.Student

class StudentAdapter(val mContext:Context, val resId:Int, val mList:ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {



    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        convertView : 기존에 그려둔 줄이 있나 (재활용 할게 있나) 판단하는 재료.

        var tempRow = convertView

//        null : 없다 를 의미하는 키워드.
//        재활용할 뷰가 없나요? 질문.


        if(tempRow == null){

//            재활용할게 없다면, XML을 새로 그려서 tempRow에 대입.

            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

//        재활용기건, 새로그렸건 tempRow 내부에는 무조건 뭔가 들어잇게 됨. (비어있지 않다)
//        row에는 절대 null일 일이 없다고 하면서 대입.


        val row = tempRow!!
        return row


    }





}