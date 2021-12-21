package com.example.projectusingdaggeronly

import android.app.Application

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/17/21.
 */

class BaseApplication: Application() {
    lateinit var dataComponent: DataComponent
    override fun onCreate() {
        dataComponent = DaggerDataComponent.builder()
            .build()
        super.onCreate()
    }
}