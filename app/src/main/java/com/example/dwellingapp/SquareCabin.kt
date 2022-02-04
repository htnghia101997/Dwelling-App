package com.example.dwellingapp

class SquareCabin(residents: Int) : Dwelling(residents = residents) {

    override val buildingMaterial: String = "aluminum"

    override val capacity: Int = 18

}