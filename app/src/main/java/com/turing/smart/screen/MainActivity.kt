package com.turing.smart.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.turing.smart.screen.ui.theme.TuringSmartScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TuringSmartScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Text(TuringSmartScreen.helloWorld(), Modifier.padding(innerPadding))

                    val serialDevices = TuringSmartScreen.getSerialDevices()
                    println(serialDevices)
                }
            }
        }
    }
}
