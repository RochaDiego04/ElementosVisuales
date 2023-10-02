package com.example.elementosvisualestarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
        val breeds = resources.getStringArray(R.array.breeds)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, breeds)
        autoCompleteTextView.setAdapter(adapter)
    }
}