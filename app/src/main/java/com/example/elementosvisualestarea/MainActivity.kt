package com.example.elementosvisualestarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    private lateinit var autoCompleteTextView: AutoCompleteTextView
    private lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoCompleteTextView = findViewById(R.id.activity_main_autoCompleteTextView)
        toggleButton = findViewById(R.id.toggleButton)

        setupAutoCompleteTextView()
        setupToggleButton()
    }

    private fun setupAutoCompleteTextView() {
        val breeds = resources.getStringArray(R.array.breeds)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, breeds)
        autoCompleteTextView.setAdapter(adapter)
    }

    private fun setupToggleButton() {
        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                disableNotifications()
            } else {
                enableNotifications()
            }
        }
    }

    private fun enableNotifications() {
        showToast("Enabled Notifications")
    }

    private fun disableNotifications() {
        showToast("Disabled Notifications")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}