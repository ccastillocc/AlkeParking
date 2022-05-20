package com.example.alkeparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alkeparking.Parking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var parking : Parking? = null
    }
}