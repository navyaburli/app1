
package com.example.myapplication  // Replace with your actual package name

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0  // variable to keep track of the count

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // connects to activity_main.xml

        // Get references to views from XML
        val counterText: TextView = findViewById(R.id.counterText)
        val increaseButton: Button = findViewById(R.id.increaseButton)

        // Set up what happens when the button is clicked
        increaseButton.setOnClickListener {
            count++
            counterText.text = "Count: $count"
        }
    }
}
