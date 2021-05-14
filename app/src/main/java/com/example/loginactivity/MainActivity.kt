package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        val email = findViewById<EditText>(R.id.email).text.toString()
        val password = findViewById<EditText>(R.id.password).text.toString()

        if (email == "godstimefestus@zuriteam.com" && password == "Password12!") {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Invalid Login credential", Toast.LENGTH_LONG).show()
        }
    }
}