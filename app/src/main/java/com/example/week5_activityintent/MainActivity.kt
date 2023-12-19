package com.example.week5_activityintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtuser: EditText
    private lateinit var edtemail: EditText
    private lateinit var edtpass: EditText
    private lateinit var edtconfirm: EditText
    private lateinit var checkBoxTerms: CheckBox
    private lateinit var checkBoxPrivacy: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtemail = findViewById(R.id.edtemail)
        edtuser = findViewById(R.id.edtuser)
        edtpass = findViewById(R.id.edtpass)
        edtconfirm = findViewById(R.id.edtconfirm)
        checkBoxTerms = findViewById(R.id.checkBoxTerms)
        checkBoxPrivacy = findViewById(R.id.checkBoxPrivacy)

        val buttonRegister = findViewById<Button>(R.id.buttonRegister)
        buttonRegister.setOnClickListener {
            if (checkBoxTerms.isChecked && checkBoxPrivacy.isChecked) {
                val intent = Intent(this@MainActivity, Hasil::class.java)
                intent.putExtra("E-mail", edtemail.text.toString())
                intent.putExtra("Username", edtuser.text.toString())
                intent.putExtra("Password", edtpass.text.toString())
                startActivity(intent)
            } else {
                // Display a message or take appropriate action if both checkboxes are not checked
                // For example, show a Toast message
                Toast.makeText(this@MainActivity, "Mohon centang kedua terms dan privacy untuk submit", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
