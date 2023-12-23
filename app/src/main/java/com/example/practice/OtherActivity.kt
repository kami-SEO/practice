package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.returnToMainBtn.setOnClickListener {
            //main으로 돌아가기
//            val myIntent = Intent(this,MainActivity::class.java)
//            startActivity(myIntent) 이거는 화면을 쌓아두는거
            //실제로 돌아가는거
            finish()
        }
    }
}