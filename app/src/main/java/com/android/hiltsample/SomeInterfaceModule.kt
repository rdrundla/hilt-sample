package com.android.hiltsample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

/*// Using @Binds
@Module
@InstallIn(ActivityComponent::class)
abstract class SomeInterfaceModule {

    @ActivityScoped
    @Binds
    abstract fun bindSomeInterface(someInterface: SomeInterfaceImpl): SomeInterface
}*/

@Module
@InstallIn(ActivityComponent::class)
class SomeInterfaceModule {

    @Impl1
    @ActivityScoped
    @Provides
    fun bindSomeInterface1(): SomeInterface {
        return SomeInterfaceImpl1()
    }

    @Impl2
    @ActivityScoped
    @Provides
    fun bindSomeInterface2(): SomeInterface {
        return SomeInterfaceImpl2()
    }
}
