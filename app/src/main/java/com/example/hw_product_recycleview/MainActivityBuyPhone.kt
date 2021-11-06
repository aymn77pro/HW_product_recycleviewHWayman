package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_product_recycleview.databinding.ActivityMainBuyPhoneBinding

class MainActivityBuyPhone : AppCompatActivity() {
    lateinit var binding: ActivityMainBuyPhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBuyPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val intetImage = intent.extras!!.getInt("phoneImg")
        val intelText = intent.extras?.getString("phoneName")
        binding.imageView2.setImageResource(intetImage)
        binding.textView.text= intelText
    }
}