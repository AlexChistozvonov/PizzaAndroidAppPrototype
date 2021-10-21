package com.example.goodandroidapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.goodandroidapplication.data.Pizza
import com.example.goodandroidapplication.data.PizzaDatabase
import com.example.goodandroidapplication.databinding.FragmentRecyclerviewBinding
import com.example.goodandroidapplication.fragments.HomeFragment
import com.example.goodandroidapplication.models.PizzaInfo
import com.example.goodandroidapplication.models.PizzaRepository
import com.squareup.picasso.Picasso


class AdapterPizza(private val pizzaInfoList: List<PizzaInfo>): RecyclerView.Adapter<AdapterPizza.PizzaHolder>() {


    class PizzaHolder(item: View): RecyclerView.ViewHolder(item) {

        val binding = FragmentRecyclerviewBinding.bind(item)
        fun bind(pizza: PizzaInfo) = with(binding){
            Picasso.with(itemView.context).load(pizza.imageUrl).into(image)
            title.text = pizza.name
            description.text = pizza.description
            price.text = pizza.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_recyclerview, parent, false)
        return PizzaHolder(view)
    }

    override fun onBindViewHolder(holder: PizzaHolder, position: Int) {
       holder.bind(pizzaInfoList[position])
    }

    override fun getItemCount(): Int {
        return pizzaInfoList.size
    }

}