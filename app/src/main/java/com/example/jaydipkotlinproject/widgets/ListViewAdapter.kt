package com.example.jaydipkotlinproject.widgets

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.jaydipkotlinproject.widgets.ListViewPracData
import com.example.jaydipkotlinproject.R
import com.squareup.picasso.Picasso

class ListViewAdapter (var context : Context, var mydatalist : List<ListViewPracData>) : BaseAdapter()
{
    override fun getCount(): Int {
        return mydatalist.size
    }

    override fun getItem(position: Int): Any {
        return mydatalist[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myview = convertView

        if(myview == null){
            myview = LayoutInflater.from(context).inflate(R.layout.activity_list_view_prac, parent,false)
        }

        val image : ImageView? = myview?.findViewById(R.id.list_image)
        val title : TextView? = myview?.findViewById(R.id.list_title)
        val desc : TextView? = myview?.findViewById(R.id.list_desc)

        Picasso.get().load(mydatalist[position].Imageurl).into(image)
        title?.text = mydatalist[position].Title
        desc?.text = mydatalist[position].Desc

        return myview!!
    }


}