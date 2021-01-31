package com.android.hiltsample

import javax.inject.Inject

class SomeInterfaceImpl @Inject constructor() : SomeInterface {
    override fun getSomeString(): String {
        return "See Interface impl1 doing thing."
    }
}