package com.turing.smart.screen

class TuringSmartScreen {
    companion object {
        init {
            System.loadLibrary("turingsmartscreenandroid")
        }

        @JvmStatic
        external fun helloWorld(): String
    }
}