package com.example.alkeparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Vehicle( "AA111AA", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_001")
        val moto = Vehicle( "B222BBB", "MOTORCYCLE", Calendar.getInstance())
        val minibus = Vehicle( "AA111AA", "MINIBUS", Calendar.getInstance())
        val bus = Vehicle( "AA111AA", "BUS", Calendar.getInstance(), "DISCOUNT_CARD_002")
        val parking = Parking(mutableSetOf(car, moto, minibus, bus))

        println(parking.vehicles.contains(car))
        println(parking.vehicles.contains(moto))
        println(parking.vehicles.contains(minibus))
        println(parking.vehicles.contains(bus))

    }

    
}