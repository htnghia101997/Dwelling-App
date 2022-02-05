package com.example.dwellingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dwelling = Dwelling()
        val squareCabin: SquareCabin = SquareCabin(residents = 12, length = 5.0)
        squareCabin.hasRoom()
        squareCabin.getRoom()

        squareCabin.floorArea()

        val roundHut: RoundHut = RoundHut(residentsHut = 5, radius = 5.0)
        roundHut.floorArea()
        roundHut.getRoom()

        val roundTower:RoundTower = RoundTower(residentsTower = 30, floors = 2, radiusRoundTower = 4.0)
        roundTower.floorArea()
        roundTower.getRoom()
    }
}