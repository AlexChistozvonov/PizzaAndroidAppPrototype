package com.example.goodandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.goodandroidapplication.databinding.ActivityMainBinding
import com.example.goodandroidapplication.fragments.HomeFragment



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(android.R.style.Theme)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment = HomeFragment()
        val hm: FragmentManager = supportFragmentManager
        hm.beginTransaction().add(R.id.rootContainer,homeFragment).commit()

    }

}