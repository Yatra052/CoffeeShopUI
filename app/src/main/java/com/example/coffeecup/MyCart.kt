package com.example.coffeecup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coffeecup.Adapter.CartAdapter
import com.example.coffeecup.Adapter.ProductAdapter
import com.example.coffeecup.Model.ProductModel
import com.example.coffeecup.Model.cartmodel
import com.example.coffeecup.databinding.ActivityMyCartBinding

class MyCart : AppCompatActivity() {
    lateinit var  binding: ActivityMyCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMyCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

      val cartList =  ArrayList<cartmodel>()
        cartList.add(
            cartmodel(
                R.drawable.photo1,
                "Lite Black Coffe \nSpecial Beans (500gm)",
                "₹ 500/-", "400gm"
            )
        )
        cartList.add(
           cartmodel(
                R.drawable.photo1,
                "Mid Black Coffe \n" + "Special Beans (500gm)",
                "₹ 800/-", "500gm"
            )
        )
        cartList.add(
           cartmodel(
                R.drawable.photo1,
                "Dark Black Coffe \n" + "Special Beans (500gm)",
                "₹ 600/-", "500gm"
            )
        )
        cartList.add(
           cartmodel(
                R.drawable.photo1,
                "Lite Black Coffe \nSpecial Beans (500gm)",
                "₹ 400/-", "500gm"
            )
        )

        val cardAdapter = CartAdapter(cartList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = cardAdapter




    }
}