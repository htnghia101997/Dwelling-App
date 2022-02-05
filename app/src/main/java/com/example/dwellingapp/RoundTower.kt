package com.example.dwellingapp

class RoundTower(private var residentsTower: Int, val floors: Int = 2, var radiusRoundTower: Double
): RoundHut(residentsHut = residentsTower, radius = radiusRoundTower ) {
    override val buildingMaterial: String = "Gold"
    override val capacity: Int = 6 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}