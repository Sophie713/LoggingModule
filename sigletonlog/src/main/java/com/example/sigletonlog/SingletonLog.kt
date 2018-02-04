package com.example.sigletonlog

import mu.KLogging

/**
 * add: applicationContext.getExternalFilesDir(null) in your main class
 */

class SingletonLog {



private constructor() {
//check its a singleton
        logger.info("Hello World.")
    }

    //use logging
    companion object : KLogging() {
        //make it singleton
        val instance: SingletonLog by lazy {
            SingletonLog()
        }
    }
    //function to be able to make random messages
    fun logDown(string: String) {
        logger.info(string)
    }

    fun warn(msg: String?) {
        logger.warn(msg)//To change body of created functions use File | Settings | File Templates.
    }

    fun warn(format: String?, vararg arguments: Any?) {
        logger.warn(format, arguments) //To change body of created functions use File | Settings | File Templates.
    }

    fun warn(msg: String?, t: Throwable?) {
        logger.warn(msg, t) //To change body of created functions use File | Settings | File Templates.
    }
    fun info(msg: String?) {
        logger.info(msg) //To change body of created functions use File | Settings | File Templates.
    }

    fun info(format: String?, vararg arguments: Any?) {
        logger.info(format, arguments)//To change body of created functions use File | Settings | File Templates.
    }

    fun info(msg: String?, t: Throwable?) {
        logger.info(msg, t) //To change body of created functions use File | Settings | File Templates.
    }
    fun error(msg: String?) {
        logger.error(msg)//To change body of created functions use File | Settings | File Templates.
    }

    fun error(format: String?, vararg arguments: Any?) {
        logger.error(format, arguments)//To change body of created functions use File | Settings | File Templates.
    }

    fun error(msg: String?, t: Throwable?) {
        logger.error(msg, t) //To change body of created functions use File | Settings | File Templates.
    }


}
