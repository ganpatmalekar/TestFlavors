package com.gsm.testflavors

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener {
            finish()
        }
    }
}