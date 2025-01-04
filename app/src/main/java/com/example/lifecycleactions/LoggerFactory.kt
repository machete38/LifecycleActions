package com.example.lifecycleactions

import androidx.lifecycle.Lifecycle

class LoggerFactory {
    companion object {
        fun newLifecycleLogger(className: String, lifecycle: Lifecycle){
            val lifecycleLogger = LifecycleLogger(className)
            lifecycle.addObserver(lifecycleLogger)
        }
    }
}