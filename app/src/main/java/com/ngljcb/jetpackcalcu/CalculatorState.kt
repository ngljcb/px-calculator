package com.ngljcb.jetpackcalcu

import com.ngljcb.jetpackcalcu.events.CalculatorOperation

data class CalculatorState (
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)