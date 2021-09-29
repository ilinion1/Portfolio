package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.portfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Привязываю разметку через биндинг
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Открываю второе активити по нажатию на кнопку регистрации
        binding.bAct1.setOnClickListener {
            val i = Intent(this, Activity2::class.java)
            startActivity(i)
        }
    }

}