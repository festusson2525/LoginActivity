package com.example.loginactivity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        var fruitsArry = resources.getStringArray(R.array.FruitsName)

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruitsArry)

        var listView = findViewById<ListView>(R.id.listview)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, fruitsArry[position], Toast.LENGTH_SHORT).show()
        }
    }
}


