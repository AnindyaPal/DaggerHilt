package com.example.daggerhilt.demo

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One {
    fun getName()
}

class ImplementOne @Inject constructor() : One {
    override fun getName() {
        Log.e("Asd", "Implement one class")
    }
}

class ImplementOneParam @Inject constructor(private val name:String) : One {
    override fun getName() {
        Log.e("Asd", "Implement one class with parameter $name")
    }
}

class InterfaceClass @Inject constructor(private val one: One) {
    fun getName() {
        one.getName()
    }

}

/*@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleExample {

    @Binds
    @Singleton
    abstract fun binding(
        implementOne: ImplementOne              // providing implementation of the One interface
    ): One
}*/

@Module
@InstallIn(SingletonComponent::class)           // another way but big boilerplate code
class AppModule1 {

    @Provides
    @Singleton
    fun binding(): One = ImplementOne()

  /*  @Provides
    @Singleton
    fun getName() : String ="Anindya"*/

    @Provides
    @Singleton
    fun binding1(name : String): ImplementOneParam = ImplementOneParam(name)



}
