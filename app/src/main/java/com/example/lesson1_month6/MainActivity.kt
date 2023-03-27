package com.example.lesson1_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lesson1_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val urlArray = arrayListOf(
        "https://fcb-abj-pre.s3.amazonaws.com/img/jugadors/MESSI.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Lionel_Messi_WC2022.jpg/220px-Lionel_Messi_WC2022.jpg",
        "https://icdn.lenta.ru/images/2021/08/06/05/20210806051459148/square_320_f9560bdf57d5f7556c3a47ed77747678.jpg",
        "https://s.hs-data.com/bilder/spieler/gross/26622.jpg",
        "https://icdn.lenta.ru/images/2021/02/04/10/20210204104924081/square_320_ecbc35fa882390af0222f78a75421787.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onCLick()
    }

    private fun onCLick() {
        val randomIndex = (urlArray.indices).random()
        binding.submitBtn.setOnClickListener {
            urlArray.add(binding.editText.text.toString())
        }
        binding.randomBtn.setOnClickListener{
            binding.image.loadImage(urlArray[randomIndex])
        }
    }

}
