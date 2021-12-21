package com.example.puredidemo

import android.util.Log

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
class SmartPhone(val battery: Battery, val simCard: SimCard, val memoryCard: MemoryCard) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
        Log.i("MYTAG", "SmartPhone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}
