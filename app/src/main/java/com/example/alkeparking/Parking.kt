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

    fun checkOutVehicle(plate : String, onSuccess: (Int) -> Unit, onError: (String) -> Unit)
    {
        vehicles.forEach(){
            if(it.plate.equals(plate)) {

                val total = calculateFee(it.type,it.checkinTime)
                vehicles.remove(it)
                onSuccess(total)
            }else{
                onError("Sorry, the check-out failed")
            }

        }
    }

    fun calculateFee(type : String, checkinTime: Calendar) : Int{
        return 0
    }

}
