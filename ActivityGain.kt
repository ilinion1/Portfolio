package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.portfolio.databinding.ActivityGainBinding

class ActivityGain : AppCompatActivity() {
    lateinit var binding: ActivityGainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bBack.setOnClickListener {
            finish()
        }
    }
}