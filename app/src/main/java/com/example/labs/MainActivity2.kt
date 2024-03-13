package com.example.labs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonClick = findViewById<Button>(R.id.button_close_activity)
        buttonClick.setOnClickListener{
            finish()
        }

        val name = intent.getStringExtra("name");
        findViewById<TextView>(R.id.text_view_student_data).apply { text = name }
    }
}