package com.example.lifecycleactions

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var lifecycleLogger: LifecycleLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        lifecycleLogger = LifecycleLogger(this::class.java.simpleName)
        lifecycle.addObserver(lifecycleLogger)

        findViewById<Button>(R.id.btnClose).setOnClickListener {
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        lifecycleLogger.logCustomEvent("onPause called")
    }

    override fun onStop() {
        super.onStop()
        lifecycleLogger.logCustomEvent("onStop called")
    }
}