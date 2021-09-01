package com.example.homepractice20210902

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToLoginBtn.setOnClickListener {

            val loginIntent = Intent(this, LoginActivity::class.java)

            startActivity(loginIntent)


        }


        moveToSigninBtn.setOnClickListener {

            val signinIntent = Intent(this, SignInActivity::class.java)

            startActivity(signinIntent)


        }

    }
}