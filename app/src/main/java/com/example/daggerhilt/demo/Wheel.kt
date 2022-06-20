package com.example.daggerhilt.demo

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()
    fun getWheel(){
        Log.e("asd", "Wheel running")
    }
}