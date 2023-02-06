package com.jordanl.newpong1dmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScoreBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_board)

        // On se revient sur la page principale
        val button_back_from_score = findViewById<Button>(R.id.btn_back_from_score)
        button_back_from_score.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}