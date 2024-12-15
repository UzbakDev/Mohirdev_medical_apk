package com.example.mohirdevmedicalcenterexe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LetsYouInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lets_you_in)

        val nextBtn = findViewById<Button>(R.id.button)

        nextBtn.setOnClickListener {
            val intent = Intent(this,CreatAccountActivity::class.java)
            startActivity(intent)
        }

    }
}