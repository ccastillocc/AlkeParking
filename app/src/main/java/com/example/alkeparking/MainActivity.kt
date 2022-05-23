package com.example.alkeparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Vehicle( "AASE67", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_001")
        val moto = Vehicle( "BXFT44", "MOTORCYCLE", Calendar.getInstance(), null)
        val minibus = Vehicle( "AADC63", "MINIBUS", Calendar.getInstance(), null)
        val bus = Vehicle( "AHBF45", "BUS", Calendar.getInstance(), "DISCOUNT_CARD_002")
        val parking = Parking(mutableSetOf(car, moto, minibus, bus),20)

        //EJERCICIO 5
        //println(parking.vehicles.contains(car))
        //println(parking.vehicles.contains(moto))
        //println(parking.vehicles.contains(minibus))
        //println(parking.vehicles.contains(bus))

        val car2 = Vehicle( "AASE67", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_003")
        //val isCarInserted = parking.addVehicle(car2)
        println(parking.addVehicle(car2))
        //parking.vehicles.remove(moto)
        //println(parking.vehicles.size)


    }

    
}