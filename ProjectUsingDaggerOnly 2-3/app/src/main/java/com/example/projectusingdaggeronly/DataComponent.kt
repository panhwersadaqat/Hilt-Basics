package com.example.projectusingdaggeronly

import dagger.Component

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/17/21.
 */
@Component(modules = [DataModule::class])
interface DataComponent {
    fun inject(mainActivity: MainActivity)
}