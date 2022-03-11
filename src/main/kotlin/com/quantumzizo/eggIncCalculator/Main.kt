package com.quantumzizo.eggIncCalculator

import kotlin.system.exitProcess

class Main

const val state = true
var prestEarnings:Double = 0.0
var eventBoost:Double = 0.0
var soulEggReward:Double = 0.0

fun main() {
    while(state) {
        try {
            println("Enter your prestige earnings ingame (It can be checked in the stats menu")
            prestEarnings = readln().toDouble()
            println("Enter the event boost for soul eggs (If there is none, enter 1)")
            eventBoost = readln().toDouble()
            soulEggReward = soulEggCalculate(prestEarnings, eventBoost)
            if(soulEggReward < 0) {
                soulEggReward = 0.0
            }
            println("You would recieve $soulEggReward soul eggs from prestige")
        } catch(e: java.lang.NumberFormatException) {}
    }
}