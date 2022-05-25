package com.example.alkeparking

import java.util.Calendar


data class Parking(var vehicles : MutableSet<Vehicle>, var cupo : Int){


     fun addVehicle(vehicle : Vehicle): String{

         val message = when{
             vehicles.size >= cupo -> "Sorry, the check-in failed"
             vehicles.add(vehicle) -> "Welcome to AlkeParking!"
             else -> "Sorry, the has check-in failed"
         }
         return message
    }


}
