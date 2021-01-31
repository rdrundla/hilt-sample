package com.android.hiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var someClass: SomeClass

    @Impl1
    @Inject
    lateinit var someInterface1: SomeInterface

    @Impl2
    @Inject
    lateinit var someInterface2: SomeInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(someClass.doSomeThing())
        println(someClass.doSomeOtherThing())
        println(someInterface1.getSomeString())
        println(someInterface2.getSomeString())
    }
}