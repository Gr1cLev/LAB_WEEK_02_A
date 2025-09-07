package com.example.lab_week_02_a

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object { private const val TAG = "MainActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.main_label).text = "LAB_WEEK_02_A — Activity Lifecycle"
    }

    override fun onStart() { super.onStart(); Log.d(TAG, "onStart") }
    override fun onResume() { super.onResume(); Log.d(TAG, "onResume") }
    override fun onPause() { super.onPause(); Log.d(TAG, "onPause") }
    override fun onStop() { super.onStop(); Log.d(TAG, "onStop") }
    override fun onRestart() { super.onRestart(); Log.d(TAG, "onRestart") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy") }
}
