package com.sherif.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var username1: EditText
    lateinit var email1: EditText
    lateinit var pass1: EditText
    lateinit var  signUpBtn: Button
    lateinit var alreadyHaveBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username1  = findViewById(R.id.edit_UN)
        email1 = findViewById(R.id.edit_email)
        pass1 = findViewById(R.id.edit_pass)
        signUpBtn = findViewById(R.id.signup_button)
        alreadyHaveBtn = findViewById(R.id.alreadyBtn)

        signUpBtn.setOnClickListener(){
            val un  = username1.text.toString()
            val em  = email1.text.toString()
            val ps  = pass1.text.toString()
            if(un.isEmpty() || un.isBlank() ||  ps.isEmpty() || ps.isBlank() || em.isEmpty() || em.isBlank()){
                Toast.makeText(this,"please enter all fields",Toast.LENGTH_SHORT).show()
            } else {
                val intnt = Intent(this,Success::class.java)
                startActivity(intnt)
            }
        }
        alreadyHaveBtn.setOnClickListener(){
            val intnt2 = Intent(this,SignIn::class.java)
            startActivity(intnt2)
        }




    }

}