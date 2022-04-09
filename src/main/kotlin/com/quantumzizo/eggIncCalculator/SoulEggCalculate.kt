package com.quantumzizo.eggIncCalculator

import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

fun soulEggCalculate(prestEarnings: Double, prestBonus: Double,  eventBoost: Double): Double {
    var soulEggReward:Double = 0.0
    soulEggReward =  prestBonus * eventBoost * (
                      max(0.0, (10.0.pow(-6) * min(prestEarnings, 10.0.pow(12))).pow(0.15) - 10.0.pow(-6).pow(0.15))
                    + max(0.0, (10.0.pow(-6) * min(prestEarnings, 10.0.pow(21))).pow(0.16) - 10.0.pow(6).pow(0.16))
                    + max(0.0, (10.0.pow(-6) * min(prestEarnings, 10.0.pow(30))).pow(0.17) - 10.0.pow(15).pow(0.17))
                    + max(0.0, (10.0.pow(-6) * min(prestEarnings, 10.0.pow(39))).pow(0.18) - 10.0.pow(24).pow(0.18))
                    + max(0.0, (10.0.pow(-6) * min(prestEarnings, 10.0.pow(48))).pow(0.19) - 10.0.pow(33).pow(0.19))
                    + max(0.0, (10.0.pow(-6) * min(prestEarnings, 10.0.pow(60))).pow(0.20) - 10.0.pow(42).pow(0.20))
                    + max(0.0, (10.0.pow(-6) * prestEarnings).pow(0.21) - 10.0.pow(54).pow(0.21))
            )
    if(soulEggReward > 1E60) {
        soulEggReward = eventBoost * (10.0.pow(-6) * prestEarnings).pow(0.21) - 1.56 * 10.0.pow(11)
    }
    return soulEggReward
}
