package com.example.alkeparking

import java.util.Calendar

const val MINUTES_IN_MILISECONDS : Int = 60000

data class ParkingSpace(var vehicle: Vehicle, val parking : Parking){

    val parkedtime : Long
        get() = (Calendar.getInstance().timeInMillis - vehicle.checkinTime.timeInMillis) / MINUTES_IN_MILISECONDS

    //fun checkOutVehicle(plate : String, onSuccess: (Int) -> Unit, onError: (String) -> Unit)
    fun checkOutVehicle(plate : String)
    {
        if (vehicle.plate == plate){
            println("$plate - ${vehicle.checkinTime.time}")
            //vehicle = vehicle.copy()
            println("Parked time: $parkedtime")
            val total = calculateFee(vehicle.type,evaluateDiscountCard(vehicle))
            parking.vehicles.remove(vehicle)
            onSuccess(total)
        }else{
            onError("Sorry, the check-out failed")
        }
    }

    fun calculateFee(type : String, hasDiscountCard : Boolean) : Int{
        val vehicletype : VehicleType = VehicleType.valueOf(type)
        val rate : Int = vehicletype.rate
        val total : Long = when{
            parkedtime <= 120 -> rate.toLong()
            parkedtime > 120 -> (rate + (((parkedtime - 120) / 15) * 5))
            else -> 0
        }
        println("Total without discount $total")
        if (hasDiscountCard)
            return (total * 0.85).toInt()
        else
            return total.toInt()
    }

    fun onSuccess(total : Int){
        println("Your fee is $total. Come back soon.")
        println("There are ${parking.vehicles.size} vehicles now")
    }

    fun onError(errMessage : String){
        println(errMessage)
    }

    fun evaluateDiscountCard(vehicle : Vehicle) : Boolean {
        /*vehicle.discountCard?.let {
            it -> this.vehicle.discountCard = "NO_DISCOUNT"
        }*/
        vehicle.discountCard = vehicle.discountCard ?: "NO_DISCOUNT"
        return !vehicle.discountCard.equals("NO_DISCOUNT")
    }

}
