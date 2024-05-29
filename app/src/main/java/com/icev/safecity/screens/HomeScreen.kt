package com.icev.safecity.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.icev.safecity.extensions.safecityButtonColors
import com.icev.safecity.extensions.safecityButtonModifier

@Composable
fun HomeScreen(navController: NavController) {
    Column (
        Modifier
            .height(16.dp)
            .width(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        LoginButton(navController)
        RegisterButton(navController)
    }
}

@Composable
fun LoginButton(navController: NavController) {
    Button(onClick = { navController.navigate(route = Screen.LoginScreen.route) },
        colors = ButtonDefaults.safecityButtonColors(),
        modifier = Modifier.safecityButtonModifier(),
        content = {
            Text(text = "Login")
        }
    )
}

@Composable
fun RegisterButton(navController: NavController) {
    Button(onClick = {navController.navigate(route = Screen.RegisterScreen.route)},
        colors = ButtonDefaults.safecityButtonColors(),
        modifier = Modifier.safecityButtonModifier(),
        content = {
            Text(text = "Register")
        }
    )
}