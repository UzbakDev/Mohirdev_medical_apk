package com.example.mohirdevmedicalcenterexe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PersonActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_1)

        val nextBtn = findViewById<Button>(R.id.nextBtnPerson1)

        nextBtn.setOnClickListener {
            val intent = Intent(this,PersonActivity2::class.java)
            startActivity(intent)
        }
    }
}