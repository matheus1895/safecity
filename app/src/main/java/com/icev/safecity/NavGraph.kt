package com.icev.safecity

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.icev.safecity.screens.HomeScreen
import com.icev.safecity.screens.LoginScreen
import com.icev.safecity.screens.RegisterScreen
import com.icev.safecity.screens.Screen

@Composable
fun SetupNavGraph( navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen()
        }
        composable(route = Screen.RegisterScreen.route) {
            RegisterScreen()
        }
    }

}