package com.example.ahmad_yusup_mobile_morning_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kirim: Button = findViewById(R.id.Kirim)
        val nama :EditText = findViewById(R.id.apa)

        kirim.setOnClickListener {
            val fragment = FragmentDaftarBarang()
            val jeneng = nama.text.toString()
            val bundle = Bundle()
            bundle.putString("nama",jeneng)
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.framelayout,fragment).commit()
        }
    }
}