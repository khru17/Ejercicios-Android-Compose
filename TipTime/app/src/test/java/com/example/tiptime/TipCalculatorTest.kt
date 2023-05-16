package com.example.tiptime
import org.junit.Test
import java.text.NumberFormat
import org.junit.Assert.*


class TipCalculatorTest {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        val actualTip = calculateTrip(amount = amount, tipPercent =tipPercent, false)

        assertEquals(expectedTip, actualTip)
    }
}