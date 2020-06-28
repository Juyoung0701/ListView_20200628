package kr.co.namu.listview_20200628

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.namu.listview_20200628.adapter.StudentAdapter
import kr.co.namu.listview_20200628.datas.Student

class MainActivity : AppCompatActivity() {


    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        실제 학생 목록 추가

        mStudentList.add(Student("이주영", 2002, "서울시 서초구"))
        mStudentList.add(Student("권순재", 2002, "성남시 분당구"))
        mStudentList.add(Student("원재연", 2002, "서울시 강서구"))
        mStudentList.add(Student("오현서", 2000, "서울시 강서구"))
        mStudentList.add(Student("박종우", 1997, "서울시 강동구"))
        mStudentList.add(Student("최예준", 2004, "남양주시 호평동"))
        mStudentList.add(Student("조경진", 1988, "서울시 은평구"))


//        아직 내용물을 안넣어준 mAdapter에 실제로 내용물 채우기.
        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

//        완성된 mAdapter를 리스트뷰와 연결
        studentListView.adapter = mAdapter





    }
}