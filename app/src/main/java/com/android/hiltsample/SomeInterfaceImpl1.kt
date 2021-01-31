package com.android.hiltsample

import javax.inject.Inject

class SomeInterfaceImpl1 @Inject constructor() : SomeInterface {
    override fun getSomeString(): String {
        return "See Interface 1 doing thing."
    }
}