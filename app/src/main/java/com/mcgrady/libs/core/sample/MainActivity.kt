package com.mcgrady.libs.core.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mcgrady.libs.core.extensions.view.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("message")

    }
}