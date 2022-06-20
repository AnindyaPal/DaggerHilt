package com.example.daggerhilt.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {

    fun getCar() {
        Log.e("Asd", "Car is Running")
    }
}