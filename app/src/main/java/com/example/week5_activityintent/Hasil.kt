package com.example.week5_activityintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Hasil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        val Result = findViewById<TextView>(R.id.Result)

        val email = intent.getStringExtra("E-mail")
        val username = intent.getStringExtra("Username")
        val password = intent.getStringExtra("Password")

        val resultText = """
            Halo, selamat datang $username
            emailmu, -$email- sudah terdaftar
            Jangan bagikan passwordmu -$password-
            kepada siapapun!
            Selamat menikmati game yang kami buat spesial untuk anda!
        """.trimIndent()

        Result.text = resultText
    }
}
