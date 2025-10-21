package com.example.blank.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blank.ui.screens.GetStarted
import com.example.blank.ui.screens.SignUp

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController : NavHostController = rememberNavController()
    NavHost(navController, startDestination = "get_started") {
        composable (route = "get_started"){ GetStarted(navController) }
        composable(route = "sign_up") { SignUp() }
    }

}