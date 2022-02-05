package com.example.dwellingapp

abstract class Dwelling(private var residentsDwelling: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residentsDwelling < capacity
    }

    abstract fun floorArea(): Double

}