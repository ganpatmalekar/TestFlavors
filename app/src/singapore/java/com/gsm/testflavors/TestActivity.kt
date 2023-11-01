package com.gsm.testflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val btnClose = findViewById<Button>(R.id.btnClose)
        btnClose.setOnClickListener {
            Log.d("TestActivity", "onCreate: Debug From Singapore")
            finish()
        }
    }
}