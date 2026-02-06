package com.example.blank.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blank.ui.screens.GetStarted
import com.example.blank.ui.screens.SignUp
import com.example.blank.ui.screens.Home
import com.example.blank.ui.screens.SignIn

@Composable
fun AppNavigation() {

    val navController : NavHostController = rememberNavController()
    NavHost(navController, startDestination = "get_started") {
        composable (route = "get_started"){ GetStarted(navController) }
        composable(route = "sign_up") { SignUp(navController) }
        composable (route ="sign_in"){ SignIn(navController) }
        composable (route = "Home") { Home() }
    }

}
