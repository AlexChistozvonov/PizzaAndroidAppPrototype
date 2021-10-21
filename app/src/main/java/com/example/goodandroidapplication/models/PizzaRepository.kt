package com.example.goodandroidapplication.models

import com.example.goodandroidapplication.models.PizzaInfo

interface PizzaRepository {
    fun getPizzas(): List<PizzaInfo>
}