package com.quantumzizo.eggIncCalculator

import kotlin.math.roundToLong
import kotlin.system.exitProcess

class Main

const val state = true
var onOrOff = 'n'
var prestEarnings:Double = 0.0
var prestBonus:Double = 0.0
var eventBoost:Double = 0.0
var soulEggReward:Double = 0.0

fun main() {
    while(state) {
        try {
            println("Continue or Exit (Enter y or n. Entering n will exit)")
            onOrOff = readln().single()
            if(onOrOff == 'y' || onOrOff == 'Y') {
                println("Enter your prestige earnings in game (It can be checked in the stats menu)")
                prestEarnings = readln().toDouble()
                println("Enter the soul egg multiplier given by a boost in game (If you do not have a boost active, enter 1)")
                prestBonus = readln().toDouble()
                println("Enter the event boost for soul eggs (If there is none, enter 1)")
                eventBoost = readln().toDouble()
                soulEggReward = soulEggCalculate(prestEarnings, prestBonus, eventBoost)
                soulEggReward.roundToLong()
                println("You would receive $soulEggReward soul eggs from prestige")
            } else if(onOrOff == 'n' || onOrOff == 'N') {
                exitProcess(0)
            }
        } catch(e: java.lang.NumberFormatException) {}
    }
}