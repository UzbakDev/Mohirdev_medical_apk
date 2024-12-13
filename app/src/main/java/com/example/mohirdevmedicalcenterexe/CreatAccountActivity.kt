package com.example.mohirdevmedicalcenterexe

import android.os.Bundle
import android.widget.EditText
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity
import android.graphics.PorterDuff;

class CreatAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creat_account)

        val emailEt = findViewById<EditText>(R.id.email_et)
        val passwordEt = findViewById<EditText>(R.id.passsword_et)

        emailEt.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                // Fokusda bo‘lsa, email EditText fonini o‘zgartirish
                emailEt.background.setColorFilter(Color.parseColor("#599DD3"), PorterDuff.Mode.SRC_IN)
                emailEt.compoundDrawablesRelative[0]?.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN)  // To‘g‘ri rang kodi
            } else {
                // Fokusdan chiqsa, email EditText fonini asl holatga qaytarish
                emailEt.background.setColorFilter(Color.parseColor("#FFEFEFEF"), PorterDuff.Mode.SRC_IN)
                emailEt.compoundDrawablesRelative[0]?.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN)
            }
        }

        passwordEt.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                // Fokusda bo‘lsa, password EditText fonini o‘zgartirish
                passwordEt.background.setColorFilter(Color.parseColor("#599DD3"), PorterDuff.Mode.SRC_IN)
                passwordEt.compoundDrawablesRelative[0]?.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN)  // To‘g‘ri rang kodi
            } else {
                // Fokusdan chiqsa, password EditText fonini asl holatga qaytarish
                passwordEt.background.setColorFilter(Color.parseColor("#FFEFEFEF"), PorterDuff.Mode.SRC_IN)
                passwordEt.compoundDrawablesRelative[0]?.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN)
            }
        }


    }
}