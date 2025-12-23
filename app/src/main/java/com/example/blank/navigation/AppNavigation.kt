package com.example.blank.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blank.ui.screens.GetStarted
import com.example.blank.ui.screens.SignUp
import com.example.blank.ui.screens.HomeScreen
import com.example.blank.ui.screens.SignIn
import com.example.blank.viewmodel.MainViewModel
import androidx.compose.runtime.getValue

@Composable
fun AppNavigation() {
val viewmodel : MainViewModel = viewModel()
    val firstName by viewmodel.firstName.collectAsState(initial = null)

    val navController : NavHostController = rememberNavController()
    NavHost(navController, startDestination = "get_started") {
        composable (route = "get_started"){ GetStarted(navController) }
        composable(route = "sign_up") { SignUp(navController,viewmodel) }
        composable (route ="sign_in"){ SignIn(navController) }
        composable (route = "Home") { HomeScreen() }
    }

}
