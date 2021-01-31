package com.android.hiltsample

import javax.inject.Inject

class SomeInterfaceImpl2 @Inject constructor() : SomeInterface {
    override fun getSomeString(): String {
        return "See Interface 2 doing thing."
    }
}