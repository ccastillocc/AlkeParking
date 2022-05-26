package com.example.alkeparking



data class Parking(var vehicles : MutableSet<Vehicle>, var cupo : Int, var results : Pair<Int,Int>){

     fun addVehicle(vehicle : Vehicle): String{

         val message = when{
             vehicles.size >= cupo -> "Sorry, the check-in failed"
             vehicles.add(vehicle) -> "Welcome to AlkeParking!"
             else -> "Sorry, the has check-in failed"
         }
         println("Vehicle List size ${vehicles.size}")
         return message
    }

    fun showResults(){
        println("${results.first} vehicles have checked out and have earnings of ${results.second}")
    }

    fun showVehicles(){
        vehicles.forEach(){
            println("Plate ${it.plate}")
        }
    }

}
