package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.portfolio.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    val imageList = arrayListOf<Int>(
        R.drawable.chaynik, R.drawable.fen, R.drawable.noutbuk, R.drawable.powerbank,
        R.drawable.pristavka, R.drawable.proig1, R.drawable.proig2, R.drawable.proig3,
        R.drawable.proig4, R.drawable.pulesos, R.drawable.samokat, R.drawable.telefon,
        R.drawable.utug, R.drawable.proig5, R.drawable.proig6, R.drawable.proig7,
        R.drawable.proig8,
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //открывает активити по клику в меню
        binding.bNav.setOnNavigationItemSelectedListener{
            when(it.itemId) {
                R.id.gain -> {
                    //открываю активи gain
                    val i = Intent(this, ActivityGain::class.java)
                    startActivity(i)
                }
                R.id.conditions ->{
                    //открываю активи conditions
                    val i = Intent(this, ActivityConditions::class.java)
                    startActivity(i)
                }
                R.id.setting ->{
                    //открываю активи setting
                    val i = Intent(this, ActivitySetting::class.java)
                    startActivity(i)
                }
            }
            true
            }

        //меняю картинки призов кнопкой "еще призы"
        var count=0
        binding.bPrize.setOnClickListener {
            if (count==0){
            binding.im1.setImageResource(R.drawable.samokat)
            binding.im2.setImageResource(R.drawable.fen)
            binding.im3.setImageResource(R.drawable.telefon)
               count++
            } else if (count==1) {
                binding.im1.setImageResource(R.drawable.noutbuk)
                binding.im2.setImageResource(R.drawable.pristavka)
                binding.im3.setImageResource(R.drawable.powerbank)
                count++
            } else{
                binding.im1.setImageResource(R.drawable.chaynik)
                binding.im2.setImageResource(R.drawable.pulesos)
                binding.im3.setImageResource(R.drawable.utug)
                count=0
            }
        }
        //рандом картинок по клику на "Испытать удачу"
        binding.bPlay.setOnClickListener {
            binding.imMain.setImageResource(imageList[random()])
        }
    }
    //рандом рандом картинок на розыграше
    private fun random(): Int {
        val imageSize = imageList.size -1
        return (0..imageSize).random()
    }
}
