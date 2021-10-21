package com.example.goodandroidapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.goodandroidapplication.R


class CartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val cart = inflater.inflate(R.layout.fragment_cart, container, false)
        val buttonEnd = cart?.findViewById<Button>(R.id.buttonEnd)
        buttonEnd?.setOnClickListener{
            val endFragment = EndFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.rootContainer, endFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return cart
    }
}