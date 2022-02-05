package com.example.dwellingapp

class SquareCabin(var residents: Int, var length: Double) : Dwelling(residentsDwelling = residents) {

    override val buildingMaterial: String = "aluminum"

    override val capacity: Int = 18

    override fun floorArea(): Double {

        return length * length
    }
}