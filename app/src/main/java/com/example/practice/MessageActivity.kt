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
    }
}