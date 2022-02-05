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

        squareCabin.floorArea()

        val roundHut: RoundHut = RoundHut(residentsHut = 5)
//        roundHut.floorArea()
    }
}