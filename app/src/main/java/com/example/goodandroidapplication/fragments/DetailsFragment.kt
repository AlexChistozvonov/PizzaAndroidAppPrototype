package com.example.goodandroidapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.goodandroidapplication.R
import com.example.goodandroidapplication.data.PizzaDatabaseRepository
import com.example.goodandroidapplication.models.PizzaInfo
import com.example.goodandroidapplication.models.PizzaRepository


class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val details = inflater.inflate(R.layout.fragment_details, container, false)
        val imagePreview = details?.findViewById<Button>(R.id.buttonPreview)
        imagePreview?.setOnClickListener{
            val previewFragment = PreviewFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.rootContainer, previewFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val buttonCart = details?.findViewById<Button>(R.id.buttonCart)
        buttonCart?.setOnClickListener{
        val cartFragment = CartFragment()
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.rootContainer, cartFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    return details
}
}
