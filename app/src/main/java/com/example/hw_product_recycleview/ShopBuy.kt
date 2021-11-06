package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_product_recycleview.databinding.ActivityShopBuyBinding
import android.view.inputmethod.InputBinding

class ShopBuy : AppCompatActivity() {
        lateinit var binding: ActivityShopBuyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShopBuyBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

      val  intentNameKey = intent.extras!!.getString("name")
     binding.textView.text = intentNameKey

    }
}