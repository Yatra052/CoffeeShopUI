package com.example.coffeecup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeecup.Adapter.ProductAdapter
import com.example.coffeecup.Model.ProductModel
import com.example.coffeecup.databinding.ActivityProductSearchBinding
import java.lang.reflect.Array

class ProductSearch : AppCompatActivity() {
    lateinit var binding: ActivityProductSearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<ProductModel>()

        list.add(
            ProductModel(
                R.drawable.photo1,
                "Lite Black Coffee \nSpecial Beans",
                "₹ 500/-", "(250gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo2,
                "Mid Black Coffee \n" + "Special Beans",
                "₹ 800/-", "600gm"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo3,
                "Dark Black Coffee \n" + "Special Beans",
                "₹ 700/-", "(400gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo4,
                "Lite Black Coffe \nSpecial Beans",
                "₹ 600/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo1,
                "Lite Black Coffe \nSpecial Beans",
                "₹ 500/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo2,
                "Mid Black Coffe \n" + "Special Beans ",
                "₹ 800/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo3,
                "Dark Black Coffe \n" + "Special Beans ",
                "₹ 700/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo4,
                "Lite Black Coffee \nSpecial Beans",
                "₹ 600/-", " (500gm)"
            )
        )

        list.add(
            ProductModel(
                R.drawable.photo2,
                "Lite Black Coffee \nSpecial Beans",
                "₹ 500/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo3,
                "Mid Black Coffe \n" + "Special Beans",
                "₹ 800/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo4,
                "Dark Black Coffe \n" + "Special Beans ",
                "₹ 700/-", "(500gm)"
            )
        )
        list.add(
            ProductModel(
                R.drawable.photo1,
                "Lite Black Coffee \nSpecial Beans",
                "₹ 600/-", "(500gm)"
            )
        )

        val adapterPro = ProductAdapter(list)
        binding.rvItems.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.rvItems.adapter = adapterPro


    }
}