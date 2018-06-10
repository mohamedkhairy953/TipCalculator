package com.example.khairy.kotlinmvvm.model

/**
 * Created by KhAiry on 6/10/2018.
 */
class RestaurantClaculator {
    fun calculateTip(checkAmount: Double, tipPct: Int): TipCalculation {
        val tipAmount = (checkAmount * (tipPct.toDouble() * 100.0))
        val grandTotal = tipAmount + checkAmount
        return TipCalculation(checkAmount = checkAmount,
                tipAmount = tipAmount,
                grandTotal = grandTotal,
                tipPct = tipPct
        )
    }
}