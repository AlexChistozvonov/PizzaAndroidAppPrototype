
package com.example.goodandroidapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.goodandroidapplication.databinding.FragmentRecyclerviewBinding


class RecyclerviewPizza : Fragment() {
    lateinit var binding: FragmentRecyclerviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentRecyclerviewBinding.inflate(layoutInflater)
    }
}









