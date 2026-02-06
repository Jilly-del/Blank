package com.example.blank.model

sealed class Screens(val screens: String) {
    data object Home: Screens("Home")
    data object Favourite : Screens("Favourite")
    data object Profile : Screens("Profile")
    data object Settings : Screens("Settings")
}