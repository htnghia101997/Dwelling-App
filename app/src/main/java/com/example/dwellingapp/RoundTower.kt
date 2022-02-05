package com.example.dwellingapp

class RoundTower(private var residentsTower: Int, val floors: Int = 2
): RoundHut(residentsHut = residentsTower) {
    override val buildingMaterial: String = "Gold"
    override val capacity: Int = 6 * floors

}