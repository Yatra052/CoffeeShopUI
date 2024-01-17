package com.example.coffeecup.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeecup.Model.cartmodel
import com.example.coffeecup.databinding.ActivityMyCartBinding
import com.example.coffeecup.databinding.CheckItemBinding

class CartAdapter(private var list: ArrayList<cartmodel>) :
    RecyclerView.Adapter<CartAdapter.viewHolder>() {


//    private fun deleteItems(position: Int) {
//        list.removeAt(position)
//        notifyItemRemoved(position)
//        notifyItemRangeChanged(position, list.size)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter.viewHolder {
        val binding =CheckItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartAdapter.viewHolder, position: Int) {
//        holder.bind(position)
        val cartmodel = list[position]
        holder.binding.cartItemImg.setImageResource(cartmodel.cartItemImage)
        holder.binding.cartItemName.text = cartmodel.cartItemName
        holder.binding.cartItemweight.text = cartmodel.cartItemWeight
        holder.binding.cartItemPrice.text =cartmodel.cartItemPrice
//        holder.binding.cartItemImg.setImageResource(model.productImg)
//        holder.binding.cartItemName.text = model.productName
//        holder.binding.cartItemPrice.text = model.productPrice
//        holder.binding.cartItemWeight.text = model.productWeight


    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class viewHolder(var binding: CheckItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(position: Int) {
//
//            binding..setOnClickListener {
//
//                val itemPosition = adapterPosition
//                if (itemPosition != RecyclerView.NO_POSITION) {
//                    deleteItems(itemPosition)
//                }
//            }
//
//        }
    }
}