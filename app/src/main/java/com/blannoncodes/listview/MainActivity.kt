package com.blannoncodes.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView =findViewById(R.id.listview)
        val listItems = arrayOf(
            "Read a Book",
            "Create a project",
            "Learn Kotlin",
            "Go For Shopping",
            "Attend a Seminar")

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter= listAdapter

        listView.setOnItemClickListener{parent, view, position, id ->
            val selectedItem =parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You have Clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}