package com.example.homepractice20210902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        idCheckBtn.setOnClickListener {
            Toast.makeText(this, "사용 가능한 아이디입니다", Toast.LENGTH_SHORT).show()

        }

    }
}