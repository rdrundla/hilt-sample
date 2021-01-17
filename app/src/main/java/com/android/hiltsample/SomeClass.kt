package com.android.hiltsample

import javax.inject.Inject

class SomeClass
@Inject
constructor(private var someOtherThing: SomeOtherThing) {
    fun doSomeThing(): String {
        return "Hello, see i did some thing!"
    }

    fun doSomeOtherThing(): String {
        return someOtherThing.doSomeOtherThing()
    }
}