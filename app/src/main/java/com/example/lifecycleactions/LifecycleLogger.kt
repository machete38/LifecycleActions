package com.example.lifecycleactions

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleLogger(private val className: String) : DefaultLifecycleObserver {

    private val TAG = "LifecycleLogger"

    override fun onCreate(owner: LifecycleOwner) {
        Log.d(TAG, "$className - onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d(TAG, "$className - onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d(TAG, "$className - onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d(TAG, "$className - onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d(TAG, "$className - onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(TAG, "$className - onDestroy")
    }



    fun logCustomEvent(event: String) {
        Log.d(TAG, "$className - $event")
    }
}