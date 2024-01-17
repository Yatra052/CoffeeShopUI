package com.example.coffeecup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeecup.databinding.ActivityProductSearchBinding
import com.example.coffeecup.databinding.ActivityProductViewBinding

class ProductView : AppCompatActivity() {
    lateinit var binding: ActivityProductViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityProductViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intent = intent
        val  img = intent.getIntExtra("product_img", R.drawable.photo1)
        val image = intent.getStringExtra("product_name")
        val price = intent.getStringExtra("product_price")
        val weight = intent.getStringExtra("product_weight")


//        binding.itemImg.setImageResource(img)
//        binding.itemName.text = componentName
    }
}