package com.mcgrady.xlabs.core.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mcgrady.xlabs.core.extensions.view.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("message")

    }
}