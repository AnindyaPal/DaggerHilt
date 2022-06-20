package com.example.daggerhilt.demo

import android.util.Log
import javax.inject.Inject

class Car2

@Inject
constructor(private val engine: Engine, private val wheel: Wheel)

{  //Dagger Dependency Constructor Injection
    fun getCar2() {
        engine.getEngine()
        wheel.getWheel()
        Log.e("Asd", "Car2 is Running")
    }
}