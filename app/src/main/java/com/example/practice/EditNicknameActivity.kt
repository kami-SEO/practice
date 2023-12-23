package com.example.practice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityEditNicknameBinding

class EditNicknameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditNicknameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNicknameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.okBtn.setOnClickListener {
//            입력한 새 닉네임 뭔지
            val inputNewNickname = binding.newNicknameEdt.text.toString()

//            입력 닉네임 메인으로

            //입력 닉네임을 담아두기 위한 용도
            val resultIntent = Intent()
            resultIntent.putExtra("nickname",inputNewNickname)
            setResult(Activity.RESULT_OK,resultIntent)
            finish()

        }
    }
}