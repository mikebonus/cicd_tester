package com.example.cicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// version 1.0.0

class MainActivity : AppCompatActivity() {

    val TAG = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: onCreate() is called here.. ")

    }
}