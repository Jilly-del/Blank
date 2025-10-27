package com.example.blank



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.blank.navigation.AppNavigation
import com.example.blank.ui.theme.BlankTheme
import com.example.blank.viewmodel.MainViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BlankTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val mainViewModel: MainViewModel = viewModel()

                    AppNavigation()

                }
            }
        }
    }
}


