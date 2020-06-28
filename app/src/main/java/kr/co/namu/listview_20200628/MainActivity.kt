package kr.co.namu.listview_20200628

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.namu.listview_20200628.datas.Student

class MainActivity : AppCompatActivity() {


    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        실제 학생 목록 추가

        mStudentList.add(Student("이주영", 2002))
        mStudentList.add(Student("권순재", 2002))
        mStudentList.add(Student("원재연", 2002))
        mStudentList.add(Student("오현서", 2000))
        mStudentList.add(Student("박종우", 1997))
        mStudentList.add(Student("최예준", 2004))
        mStudentList.add(Student("조경진", 1988))





    }
}