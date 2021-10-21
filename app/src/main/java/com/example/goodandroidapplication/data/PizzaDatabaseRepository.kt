package com.example.goodandroidapplication.data

import com.example.goodandroidapplication.models.PizzaInfo
import com.example.goodandroidapplication.models.PizzaRepository

class PizzaDatabaseRepository: PizzaRepository {
    override fun getPizzas(): List<PizzaInfo>{
        return PizzaDatabase.pizzaDao
            .getAll()
            .map { PizzaInfo(
                it.id,
                it.name,
                it.price,
                it.imageUrl,
                it.description) }
    }
}