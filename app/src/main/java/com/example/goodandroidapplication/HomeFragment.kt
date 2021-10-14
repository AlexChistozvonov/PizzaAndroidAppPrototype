package com.example.goodandroidapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class HomeFragment: Fragment() {

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         val home = inflater.inflate(R.layout.fragment_home, container, false)
         val buttonDetails = home.findViewById<Button>(R.id.buttonDetails)

        buttonDetails.setOnClickListener{
            val detailsFragment = DetailsFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.rootContainer, detailsFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return home
    }
}