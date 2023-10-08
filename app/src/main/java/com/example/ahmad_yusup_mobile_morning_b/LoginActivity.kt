package com.example.ahmad_yusup_mobile_morning_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnlog: Button = findViewById(R.id.buttonLog)
        btnlog.setOnClickListener(this)
    }

    override fun onClick(login: View) {
        when(login.id) {
            R.id.buttonLog -> {
                val loginbang =
                    Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(loginbang)
            }
        }

    }
}