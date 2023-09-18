package com.example.jaydipkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.jaydipkotlinproject.R

class List_view_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_prac)

        val listview : ListView = findViewById(R.id.list_view)

        val mydayaList = mutableListOf<ListViewPracData>()

        mydayaList.add(ListViewPracData("https://picsum.photos/id/0/5000/3333","Image 1","This is Image 1"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/1/5000/3333","Image 2","This is Image 2"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/2/5000/3333","Image 3","This is Image 3"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/3/5000/3333","Image 4","This is Image 4"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/4/5000/3333","Image 5","This is Image 5"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/5/5000/3334","Image 6","This is Image 6"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/6/5000/3333","Image 7","This is Image 7"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/7/4728/3168","Image 8","This is Image 8"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/8/5000/3333","Image 9","This is Image 9"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/9/5000/3269","Image 10","This is Image 10"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/10/2500/1667","Image 11","This is Image 11"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/11/2500/1667","Image 12","This is Image 12"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/12/2500/1667","Image 13","This is Image 13"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/13/2500/1667","Image 14","This is Image 14"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/14/2500/1667","Image 15","This is Image 15"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/15/2500/1667","Image 16","This is Image 16"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/16/2500/1667","Image 17","This is Image 17"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/17/2500/1667","Image 18","This is Image 18"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/18/2500/1667","Image 19","This is Image 19"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/19/2500/1667","Image 20","This is Image 20"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/20/3670/2462","Image 21","This is Image 21"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/21/3008/2008","Image 22","This is Image 22"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/22/4434/3729","Image 23","This is Image 23"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/23/3887/4899","Image 24","This is Image 24"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/24/4855/1803","Image 25","This is Image 25"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/25/5000/3333","Image 26","This is Image 26"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/26/4209/2769","Image 27","This is Image 27"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/27/3264/1836","Image 28","This is Image 28"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/28/4928/3264","Image 29","This is Image 29"))
        mydayaList.add(ListViewPracData("https://picsum.photos/id/29/4000/2670","Image 30","This is Image 30"))

        listview.adapter = ListViewAdapter(this,mydayaList)

    }
}