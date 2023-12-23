package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityMessageBinding



class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //화면 들어올때 데이터 텍스트뷰에 반영
        val intentMessage = intent.getStringExtra("message")

        binding.receivedMessageTxt.text = intentMessage
    }
}