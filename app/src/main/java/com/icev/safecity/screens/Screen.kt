package com.icev.safecity.screens

sealed class Screen (val route: String){
    data object HomeScreen : Screen("home_screen")
    data object LoginScreen : Screen("login_screen")
    data object RegisterScreen : Screen("register_screen")
}