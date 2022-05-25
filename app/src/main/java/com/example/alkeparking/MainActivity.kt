package com.example.alkeparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*


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

        //val car2 = Vehicle( "AASE67", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_003")
        //val isCarInserted = parking.addVehicle(car2)
        //println(parking.addVehicle(car2))
        //parking.vehicles.remove(moto)
        //println(parking.vehicles.size)

        //EJERCICIO 6
        var vehicleAux = Vehicle( "AASE68", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_003")
        val vehicleList = mutableListOf(vehicleAux)
        vehicleAux = Vehicle( "BXFT45", "MOTORCYCLE", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AADC64", "MINIBUS", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AHBF46", "BUS", Calendar.getInstance(), "DISCOUNT_CARD_004")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AASE69", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_005")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "BXFT46", "MOTORCYCLE", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AADC65", "MINIBUS", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AHBF47", "BUS", Calendar.getInstance(), "DISCOUNT_CARD_006")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AASE70", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_007")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "BXFT47", "MOTORCYCLE", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AADC66", "MINIBUS", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AHBF48", "BUS", Calendar.getInstance(), "DISCOUNT_CARD_008")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AASE71", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_009")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "BXFT48", "MOTORCYCLE", Calendar.getInstance(), null)
        vehicleList.add(vehicleAux)
        var ingrDate : Calendar = Calendar.getInstance()
        ingrDate.set(2022,4,25,12,0,0)
        println("fecha nueva ${ingrDate.time}")
        vehicleAux = Vehicle( "AADC67", "MINIBUS", ingrDate, null)
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "AHBF49", "BUS", Calendar.getInstance(), "DISCOUNT_CARD_010")
        vehicleList.add(vehicleAux)
        vehicleAux = Vehicle( "PAAA88", "CAR", Calendar.getInstance(), "DISCOUNT_CARD_011")
        vehicleList.add(vehicleAux)


        vehicleList.forEach{
            println(parking.addVehicle(it))
            println("Tamaño ${parking.vehicles.size}")
        }

        val parkspace = ParkingSpace(vehicleAux,parking)
        parkspace.checkOutVehicle("AADC67")

    }

    /*fun exito(num : Int){
        println(num)
    }

    fun error(str : String){
        println("str")
    }*/

    
}