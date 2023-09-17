package com.example.firstkotlinproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

//class MyAdapter(var context: Context, var itemname: Array<String>, var itemimages: Array<String>) :
class MyAdapter(var context: Context, var itemname: List<String>, var itemimages: List<String>) :
    BaseAdapter() {

    var layoutInflater: LayoutInflater? = null
    override fun getCount(): Int {
        return itemname.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var myView = convertView

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if(myView == null){
            myView = layoutInflater!!.inflate(R.layout.activity_grid_view_content,null)
        }

        val imageView : ImageView = myView!!.findViewById(R.id.item_img)
        val textview : TextView = myView.findViewById(R.id.item_name)

        Picasso.get().load(itemimages[position]).into(imageView)
//        imageView.setImageResource(itemimages[position])
        textview.text = itemname[position]

        return myView
    }
}
