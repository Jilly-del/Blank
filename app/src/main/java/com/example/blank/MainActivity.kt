package com.example.blank



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.blank.navigation.AppNavigation
import com.example.blank.ui.screens.HomeScreen
import com.example.blank.ui.theme.BlankTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BlankTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    AppNavigation()
                    HomeScreen()
                }
            }
        }
    }
}


