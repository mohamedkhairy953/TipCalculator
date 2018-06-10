package com.example.khairy.kotlinmvvm.model

/**
 * Created by KhAiry on 6/10/2018.
 */
data class TipCalculation(
        val checkAmount: Double=0.0,
        val tipPct: Int =0.0,
        val tipAmount: Double=0.0,
        val grandTotal: Double=0.0
)