package com.example.alkeparking

import java.util.Calendar

const val MINUTES_IN_MILISECONDS : Int = 60000

data class ParkingSpace(var vehicle: Vehicle){

    val parkedtime : Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkinTime.timeInMillis) / MINUTES_IN_MILISECONDS

    fun getHora():Long{
        return(parkedtime)
    }
}
