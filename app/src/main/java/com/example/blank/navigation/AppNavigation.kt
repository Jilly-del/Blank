package com.example.blank2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blank2.ui.screens.GetStarted
import com.example.blank2.ui.screens.HomeScreen
import com.example.blank2.ui.screens.SignIn
import com.example.blank2.ui.screens.SignUp
import com.example.blank2.viewmodel.MainViewModel

@Composable
fun AppNavigation( viewModel: MainViewModel) {
    val navController : NavHostController = rememberNavController()
    NavHost(navController, startDestination = "get_started") {
        composable (route = "get_started"){ GetStarted(navController) }
        composable(route = "sign_up") { SignUp(navController, viewModel) }
        composable (route ="sign_in"){ SignIn(navController) }
        composable (route = "Home") { HomeScreen(viewModel) }
    }

}
