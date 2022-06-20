package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhilt.demo.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car          //Dagger Dependency Field Injection
    var car1: Car1 = Car1()        //Manual Dependency Injection

    @Inject
    lateinit var car2: Car2        //Dagger Dependency Constructor Injection

    @Inject
    lateinit var interfaceClass: InterfaceClass

    @Inject
    lateinit var implementOne: ImplementOne

    @Inject
    lateinit var qualifierSample: QualifierSample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
        car1.getCar1()
        car2.getCar2()

        interfaceClass.getName() // first way to provide dependency of an interface

        implementOne.getName()

        qualifierSample.getName()
    }
}

