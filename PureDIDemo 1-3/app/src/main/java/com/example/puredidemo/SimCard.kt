package com.example.puredidemo

import android.util.Log

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
class SimCard(private  val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}