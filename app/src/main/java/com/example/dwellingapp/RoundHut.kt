package com.example.dwellingapp
import kotlin.math.PI
open class RoundHut(var residentsHut: Int, var radius: Double) :Dwelling(residentsDwelling = residentsHut) {

    override val buildingMaterial: String = "Iron"
    override val capacity: Int = 6

    override fun floorArea(): Double {
        return PI * radius * radius
    }
}