package com.projects.a03debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Thread.sleep(1000)
            Log.v(TAG, "${numerator / denominator}")
            findViewById<TextView>(R.id.division_textView).text = "${numerator/denominator}"
            denominator--
        }
    }

    fun logging() {
        Log.v(TAG, "Hello, world!")
    }
}