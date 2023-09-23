package com.example.jaydipkotlinproject.HomepageListView

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.Toast
import com.example.jaydipkotlinproject.R

class HomepageListviewAdapter(var context: Context, var HomepagedataList: List<HomepageData>) :
    BaseAdapter() {
    override fun getCount(): Int {//ok aama badhe widget aave 6e
        return HomepagedataList.size
    }

    override fun getItem(p0: Int): Any {
        return HomepagedataList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var homepageview = p1

        if (homepageview == null) {
            homepageview = LayoutInflater.from(context).inflate(
                R.layout.activity_home_page_content_view_manager, p2, false
            )
        }

        val btnname: Button = homepageview!!.findViewById(R.id.Home_page_btn)

        btnname.text = HomepagedataList[p0].widgetname

        btnname.setOnClickListener {
            Toast.makeText(
                context,
                HomepagedataList[p0].widgetname + " Clicked",
                Toast.LENGTH_SHORT
            ).show()
        }
        return homepageview
    }
}