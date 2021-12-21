package com.example.projectusingdaggeronly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var dataSource: DataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as BaseApplication).dataComponent
            .inject(this)
        dataSource.display()
    }
}