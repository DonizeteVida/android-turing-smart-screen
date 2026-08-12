package com.turing.smart.screen

class NativeLib {

    /**
     * A native method that is implemented by the 'screen' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'screen' library on application startup.
        init {
            System.loadLibrary("screen")
        }
    }
}