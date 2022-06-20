package com.example.daggerhilt.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

class QualifierSample @Inject constructor(
    @Fname
    private val fName: String,
    @Lname
    private val lName: String
) {
    fun getName() {
        Log.e("Asd", " Full name $fName, $lName ");
    }
}


@Module
@InstallIn(SingletonComponent::class)
class ModuleApp {
    @Provides
    @Fname
    fun getFname(): String = "Anindya"

    @Provides
    @Lname
    fun getLname(): String = "Pal"

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Fname

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Lname

