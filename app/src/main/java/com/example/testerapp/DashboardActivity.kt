package com.example.testerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

lateinit var welcomeText: String
lateinit var tvWelcome: TextView
class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        welcomeText ="Welcome "+ intent.getStringExtra("userName").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.text = welcomeText;


    }
}