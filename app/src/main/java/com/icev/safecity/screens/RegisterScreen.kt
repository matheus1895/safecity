package com.icev.safecity.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.icev.safecity.extensions.safecityButtonColors
import com.icev.safecity.extensions.safecityButtonModifier

@Composable
fun RegisterScreen() {
    Column (
        Modifier
            .height(16.dp)
            .width(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }

        TextField(value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier
                .border(2.dp, Color.Green)
                .padding(4.dp))

        TextField(value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier
                .border(2.dp, Color.Green)
                .padding(4.dp))

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.safecityButtonColors(),
            modifier = Modifier . safecityButtonModifier(),
            content = {
                Text(text = "Submit", fontSize = 24.sp)
            }
        )
    }
}
