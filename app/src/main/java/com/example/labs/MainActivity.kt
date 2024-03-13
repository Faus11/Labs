package com.example.labs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button_open_second_activity)
        buttonClick.setOnClickListener{
            val intent =  Intent(this, MainActivity2::class.java).apply {putExtra("name", "Jose Faus")}
            startActivity(intent)
            finish()
        }
    }
}