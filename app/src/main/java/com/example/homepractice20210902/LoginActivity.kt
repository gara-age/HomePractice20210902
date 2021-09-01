package com.example.homepractice20210902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inLoginScreenBtn.setOnClickListener {

            val inputUserId = inputId.text.toString()

            val inputUserPw = inputPw.text.toString()


            if(inputUserId == "admin"){
                if (inputUserPw == "qwer"){

                    Toast.makeText(this, "관리자님, 환영합니다", Toast.LENGTH_SHORT).show()

                }
                else{
                    Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }

        }
    }
}