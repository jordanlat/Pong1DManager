package com.jordanl.newpong1dmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // On se dirige vers la page des Scores
        val button_to_score = findViewById<Button>(R.id.btn_to_score)
        button_to_score.setOnClickListener {
            startActivity(Intent(applicationContext, ScoreBoard::class.java))
        }


        // On se dirige vers la page de Configuration
        val button_to_config = findViewById<Button>(R.id.btn_to_config)
        button_to_config.setOnClickListener {
            startActivity(Intent(applicationContext, Config::class.java))
        }
    }
}