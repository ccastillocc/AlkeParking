package com.example.alkeparking

import java.util.Calendar

const val MINUTES_IN_MILISECONDS : Int = 60000

data class ParkingSpace(var vehicle: Vehicle, val parking : Parking){

    val parkedtime : Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkinTime.timeInMillis) / MINUTES_IN_MILISECONDS

    //fun checkOutVehicle(plate : String, onSuccess: (Int) -> Unit, onError: (String) -> Unit)
    fun checkOutVehicle(plate : String)
    {
        parking.vehicles.forEach(){
            if(it.plate == plate) {
                println(it.plate)
                println(it.checkinTime.time)
                vehicle = it.copy()
                //val parkedtime = (Calendar.getInstance().timeInMillis - vehicle.checkinTime.timeInMillis) / MINUTES_IN_MILISECONDS
                println("Parked time: $parkedtime")
                //val total = calculateFee(it.type,parkedtime)
                //parking.vehicles.remove(it)
                //onSuccess(total)
            }else{
                onError("Sorry, the check-out failed")
            }
        }
    }

    fun calculateFee(type : String, parkedTime: Long) : Int{
        return 0
    }

    fun onSuccess(a : Int){
        println(a)
    }

    fun onError(a : String){
        println(a)
    }

}
