package com.android.hiltsample

import javax.inject.Inject

class SomeOtherThing
@Inject
constructor() {
    fun doSomeOtherThing(): String {
        return "Hello, see i did some other thing!"
    }
}