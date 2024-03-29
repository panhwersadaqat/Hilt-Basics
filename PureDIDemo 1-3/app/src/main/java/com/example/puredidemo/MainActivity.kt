package com.example.puredidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartPhone = SmartPhone(
            Battery(),
            SimCard(ServiceProvider()),
            MemoryCard()
        ).makeACallWithRecording()
    }
}