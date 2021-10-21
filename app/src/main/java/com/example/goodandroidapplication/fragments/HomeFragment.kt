package com.example.goodandroidapplication.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.goodandroidapplication.AdapterPizza
import com.example.goodandroidapplication.R
import com.example.goodandroidapplication.data.PizzaDatabaseRepository
import com.example.goodandroidapplication.databinding.FragmentHomeBinding



class HomeFragment: Fragment() {
    lateinit var binding: FragmentHomeBinding
     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = FragmentHomeBinding.inflate(layoutInflater)

         val home = inflater.inflate(R.layout.fragment_home, container, false)
         val buttonDetails = home.findViewById<Button>(R.id.buttonDetails)

        buttonDetails.setOnClickListener{
            val detailsFragment = DetailsFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.rootContainer, detailsFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        init()
        return home

    }

    fun init() = with(binding){
        val adapterPizza = AdapterPizza(PizzaDatabaseRepository().getPizzas())
        myRecycler.layoutManager = LinearLayoutManager(this@HomeFragment.context)
        myRecycler.adapter = adapterPizza


    }


}