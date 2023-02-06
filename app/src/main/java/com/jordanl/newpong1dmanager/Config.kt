package com.jordanl.newpong1dmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Config : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)

        // On se revient sur la page principale
        val button_back_from_config = findViewById<Button>(R.id.btn_back_from_config)
        button_back_from_config.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}