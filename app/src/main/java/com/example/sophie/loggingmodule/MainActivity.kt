package com.example.sophie.loggingmodule

import android.os.Bundle
import mu.KLogging
import android.support.v7.app.AppCompatActivity
import com.example.sigletonlog.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
//find directory to save to
        applicationContext.getExternalFilesDir(null);

        fab.setOnClickListener { view ->
            //log what I want to save
            SingletonLog.instance.logDown("Hello..")
            SingletonLog.instance.logDown("Hello....")
            SingletonLog.instance.logDown("Oh, Hello..")
        }

    }
}

