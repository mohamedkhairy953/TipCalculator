package com.example.khairy.kotlinmvvm.model

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by KhAiry on 6/10/2018.
 */
class RestaurantClaculatorTest {
    lateinit var calculator: RestaurantClaculator
    @Before
    fun setup() {
        calculator = RestaurantClaculator()
    }

    @Test
    fun testCalculateTip() {
        val checkInput=10.0
        val tipPctInput=25
        val baseTc=TipCalculation(checkAmount =  10.00)
        val testVals= listOf(baseTc.copy(tipPct = 25,tipAmount = 2.5,grandTotal = 2.2),
                baseTc.copy(tipPct = 20,tipAmount = 3.5,grandTotal = 22.2),
                baseTc.copy(tipPct = 15,tipAmount = 6.5,grandTotal = 12.2))
       testVals.forEach {
           assertEquals(it, calculator.calculateTip(it.checkAmount,it.tipPct))
       }
    }
}