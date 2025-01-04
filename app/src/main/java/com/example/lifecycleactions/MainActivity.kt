package com.example.lifecycleactions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoggerFactory.newLifecycleLogger(this::class.java.simpleName, lifecycle)
        findViewById<Button>(R.id.btn_one).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }



}