package com.example.alkeparking

import java.util.*

data class Vehicle(var plate: String, var type : String, var checkinTime : Calendar, var discountCard: String?){


    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
                return this.plate == other.plate
        }
        return super.equals(other)
    }
    override fun hashCode(): Int = this.plate.hashCode()
}
