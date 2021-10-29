package com.sherif.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {
    lateinit var username2: EditText

    lateinit var pass2: EditText
    lateinit var signInBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        username2 = findViewById(R.id.edit_UN2)

        pass2 = findViewById(R.id.edit_pass2)
        signInBtn = findViewById(R.id.signin_button)


        signInBtn.setOnClickListener() {
            val un2 = username2.text.toString()

            val ps2 = pass2.text.toString()
            if (un2.isEmpty() || un2.isBlank() || ps2.isEmpty() || ps2.isBlank()) {
                Toast.makeText(this, "please enter all fields", Toast.LENGTH_SHORT).show()
            }
            else {
                val intnt3 = Intent(this,Success::class.java)
                startActivity(intnt3)
            }
        }

    }
}