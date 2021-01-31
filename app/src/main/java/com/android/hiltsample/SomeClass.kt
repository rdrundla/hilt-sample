package com.android.hiltsample

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class SomeClass
@Inject
constructor(var someOtherThing: SomeOtherThing) {
    fun doSomeThing(): String {
        return "Hello, see i did some thing!"
    }

    fun doSomeOtherThing(): String {
        return someOtherThing.doSomeOtherThing()
    }
}