package com.example.alkeparking

data class Vehicle(val plate: String){

    var chassis = 0
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
                return this.plate == other.plate
        }
        return super.equals(other)
    }
    override fun hashCode(): Int = this.plate.hashCode()
}
