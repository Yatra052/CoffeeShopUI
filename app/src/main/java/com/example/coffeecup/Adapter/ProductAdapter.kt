package com.example.coffeecup.Adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeecup.Model.ProductModel
import com.example.coffeecup.ProductView
import com.example.coffeecup.databinding.ProductItemsBinding


class ProductAdapter (private  var list: ArrayList<ProductModel>):
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {

        val binding = ProductItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
      val model = list[position]
        holder.binding.productImg.setImageResource(model.productImg)
        holder.binding.productName.text =  model.productName
        holder.binding.productPrice.text =model.productPrice
        holder.binding.productWeight.text = model.productWeight

        holder.itemView.setOnClickListener{
            var intent =Intent(holder.itemView.context, ProductView::class.java)
           intent.putExtra("product_img", model.productImg)
            intent.putExtra("product_name", model.productName)
            intent.putExtra("product_price", model.productPrice)
            intent.putExtra("product_weight", model.productWeight)
            holder.itemView.context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
      return list.size
    }

    inner class ViewHolder(var binding: ProductItemsBinding):RecyclerView.ViewHolder(binding.root)


}