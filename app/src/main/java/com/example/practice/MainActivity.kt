package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val Request_For_Nickname = 1005
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editNicknameBtn.setOnClickListener {
            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent,Request_For_Nickname)
        }

        binding.sendMessageBtn.setOnClickListener {
//            입력한내용 변수에 저장
            val inputMessage = binding.messageEdt.text.toString()

            val myIntent = Intent(this,MessageActivity::class.java)
            myIntent.putExtra("message",inputMessage)

            startActivity(myIntent)

        }

        binding.moveToOtherBtn.setOnClickListener {
//다른화면으로 이동
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)
        }
    }
}