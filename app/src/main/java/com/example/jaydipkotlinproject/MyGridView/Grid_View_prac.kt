package com.example.jaydipkotlinproject.MyGridView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.jaydipkotlinproject.R

class Grid_View_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view_prac)

        val grid_view: GridView = findViewById(R.id.grid_view)

//        val Itemname = arrayOf(
//            "Instagram",
//            "Facebook",
//            "Snapchat",
//            "Whatsapp",
//            "Linkdin",
//            "Twitter",
//        )

//        val Itemimages = arrayOf(
//            R.drawable.instagram,
//            R.drawable.facebook,
//            R.drawable.snapchat,
//            R.drawable.instagram,
//            R.drawable.linkdin,
//            R.drawable.twitter,
//        )

        val Itemname = listOf(
            "Image 1",
            "Image 2",
            "Image 3",
            "Image 4",
            "Image 5",
            "Image 6",
            "Image 7",
            "Image 8",
            "Image 9",
            "Image 10",
            "Image 11",
            "Image 12",
            "Image 13",
            "Image 14",
            "Image 15",
            "Image 16",
            "Image 17",
            "Image 18",
            "Image 19",
            "Image 20",
            "Image 21",
            "Image 22",
            "Image 23",
            "Image 24",
            "Image 25",
            "Image 26",
            "Image 27",
            "Image 28",
            "Image 29",
            "Image 30",
        )

        val Itemimages = listOf(
            "https://picsum.photos/id/0/5000/3333",
            "https://picsum.photos/id/1/5000/3333",
            "https://picsum.photos/id/2/5000/3333",
            "https://picsum.photos/id/3/5000/3333",
            "https://picsum.photos/id/4/5000/3333",
            "https://picsum.photos/id/5/5000/3334",
            "https://picsum.photos/id/6/5000/3333",
            "https://picsum.photos/id/7/4728/3168",
            "https://picsum.photos/id/8/5000/3333",
            "https://picsum.photos/id/9/5000/3269",
            "https://picsum.photos/id/10/2500/1667",
            "https://picsum.photos/id/11/2500/1667",
            "https://picsum.photos/id/12/2500/1667",
            "https://picsum.photos/id/13/2500/1667",
            "https://picsum.photos/id/14/2500/1667",
            "https://picsum.photos/id/15/2500/1667",
            "https://picsum.photos/id/16/2500/1667",
            "https://picsum.photos/id/17/2500/1667",
            "https://picsum.photos/id/18/2500/1667",
            "https://picsum.photos/id/19/2500/1667",
            "https://picsum.photos/id/20/3670/2462",
            "https://picsum.photos/id/21/3008/2008",
            "https://picsum.photos/id/22/4434/3729",
            "https://picsum.photos/id/23/3887/4899",
            "https://picsum.photos/id/24/4855/1803",
            "https://picsum.photos/id/25/5000/3333",
            "https://picsum.photos/id/26/4209/2769",
            "https://picsum.photos/id/27/3264/1836",
            "https://picsum.photos/id/28/4928/3264",
            "https://picsum.photos/id/29/4000/2670",
        )

        grid_view.adapter = GridViewAdapter(this, Itemname, Itemimages)
        grid_view.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

                Toast.makeText(this, Itemimages[position], Toast.LENGTH_SHORT).show()

                intent = Intent(this, Grid_View_Content::class.java)
                intent.putExtra("Imagelink",Itemimages[position])
                startActivity(intent)
            }

    }
}