package com.shiva.doctorappointmentui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.shiva.doctorappointmentui.presentation.screen.MainScreen
import com.shiva.doctorappointmentui.ui.theme.DoctorAppointmentUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoctorAppointmentUITheme {
                MainScreen()
            }
        }
    }
}
