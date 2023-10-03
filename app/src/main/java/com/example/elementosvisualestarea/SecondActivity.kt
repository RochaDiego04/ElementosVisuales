package com.example.elementosvisualestarea

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setupCountrySpinner()
        setupPreviousButton()
    }

    private fun setupCountrySpinner() {
        val spinnerCountries: Spinner = findViewById(R.id.spinnerCountries)

        val countries = resources.getStringArray(R.array.branch_array)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerCountries.adapter = adapter
    }

    private fun setupPreviousButton() {
        val previousButton = findViewById<Button>(R.id.activity_main_btn_previous)

        previousButton.setOnClickListener {
            navigateToMainActivity()
        }
    }

    private fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
