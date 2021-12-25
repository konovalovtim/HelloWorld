package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.util.Log

class HelloWorldActivity: Activity() {

    val TAG = "HelloWorld"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actyvity_hello_world)
        Log.d(TAG,"onCreate")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }
}