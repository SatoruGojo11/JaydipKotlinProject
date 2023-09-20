package com.example.jaydipkotlinproject.HomepageListView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.firstkotlinproject.widgets.Constraint_layout_prac
import com.example.jaydipkotlinproject.R
import com.example.jaydipkotlinproject.widgets.ListViewAdapter

class Home_Page_List_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page_list_view)

        val Homepagelist: ListView = findViewById(R.id.home_page_listview)

        val mydayaList = mutableListOf<HomepageData>()

        mydayaList.add(HomepageData("Constraint_layout", "Constraint_layout_prac"))
        mydayaList.add(HomepageData("Relative_layout", "Relative_layout_prac"))
        mydayaList.add(HomepageData("Linear_layout", "linear_layout_prac"))
        mydayaList.add(HomepageData("Date_Time", "Date_Time_Picker_prac"))
        mydayaList.add(HomepageData("Check_Box", "Checkbox_prac"))
        mydayaList.add(HomepageData("Radio", "Radio_prac"))
        mydayaList.add(HomepageData("Card_View", "Card_View_prac"))
        mydayaList.add(HomepageData("Spinner", "Spinner_prac"))
        mydayaList.add(HomepageData("Image_view", "Image_View_prac"))
        mydayaList.add(HomepageData("Toggle_Button", "Toggle_prac"))
        mydayaList.add(HomepageData("Switch_Compat", "Switch_Compat_prac"))
        mydayaList.add(HomepageData("Grid_view", "Grid_View_prac"))
        mydayaList.add(HomepageData("List_view", "List_view_prac"))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))
//        mydayaList.add(HomepageData("",))

        Homepagelist.adapter = HomepageListviewAdapter(this, mydayaList)

        Homepagelist.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

//                intent = Intent(this, Constraint_layout_prac::class.java)
//                startActivity(intent)

                Toast.makeText(this, mydayaList[i].widgetname + " Button Clicked", Toast.LENGTH_SHORT)
                    .show()

            }
    }
}