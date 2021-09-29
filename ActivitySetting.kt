package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.portfolio.databinding.ActivitySettingBinding

class ActivitySetting : AppCompatActivity() {
    lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //закрываю активити
        binding.bBack.setOnClickListener {
            finish()


        }
    }


}