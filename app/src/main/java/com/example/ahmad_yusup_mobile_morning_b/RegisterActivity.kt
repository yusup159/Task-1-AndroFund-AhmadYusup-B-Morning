package com.example.ahmad_yusup_mobile_morning_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnreg: Button = findViewById(R.id.buttonRegis)
        btnreg.setOnClickListener(this)
    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.buttonRegis ->{
                val regiscuy =
                    Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(regiscuy)
            }
        }
    }
}