package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.daggerhilt.demo.*
import com.example.daggerhilt.viewModel.PostViewModel
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

    private val postViewModel: PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
        car1.getCar1()
        car2.getCar2()

        interfaceClass.getName() // first way to provide dependency of an interface

        implementOne.getName()

        qualifierSample.getName()

        postViewModel.response.observe(this, Observer {
            response->
            Log.e("Asd", response.get(0).body);
        })
    }
}

