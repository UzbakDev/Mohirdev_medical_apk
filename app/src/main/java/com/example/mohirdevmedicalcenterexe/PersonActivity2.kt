package com.example.mohirdevmedicalcenterexe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PersonActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_2)

        val nextBtn = findViewById<Button>(R.id.nextBtnPerson2)

        nextBtn.setOnClickListener {
            val intent = Intent(this,PersonActivity3::class.java)
            startActivity(intent)
        }
    }
}