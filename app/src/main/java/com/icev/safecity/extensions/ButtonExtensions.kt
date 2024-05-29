package com.icev.safecity.extensions

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonDefaults.safecityButtonColors() = buttonColors(
    containerColor = Color(0xFF057CCA),
    contentColor = Color(0xFFFFFFFF),
    disabledContainerColor = Color(0x40888181),
    disabledContentColor = Color(0xFFFFFFFF)
)

fun Modifier.safecityButtonModifier(): Modifier = this
    .shadow(
        elevation = 4.dp,
        spotColor = Color(0x40000000),
        ambientColor = Color(0x40000000)
    )
    .padding(4.dp)
    .width(136.dp)
    .height(44.dp)