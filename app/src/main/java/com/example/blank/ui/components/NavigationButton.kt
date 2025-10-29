package com.example.blank.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NavigationButton( title: String, onClick:() -> Unit) {
    Spacer(modifier = Modifier.height(40.dp))
    Button(
        onClick = {
            onClick()
        },
        modifier = Modifier
            .height(76.dp)
            .width(316.dp),

        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF282828),
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color(0xFF282828)
        ),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp)

    ) {
        Text(title, fontSize = 20.sp)
    }
}