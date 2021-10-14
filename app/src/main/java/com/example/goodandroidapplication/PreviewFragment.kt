package com.example.goodandroidapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class PreviewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val preview = inflater.inflate(R.layout.fragment_preview, container, false)
        val buttonCarts = preview?.findViewById<Button>(R.id.buttonCarts)
        buttonCarts?.setOnClickListener{
            val cartFragment = CartFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.rootContainer, cartFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return preview
    }
}