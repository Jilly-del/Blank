package com.example.blank.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.blank.model.CartItem

@Composable
fun CartItemCard(item : CartItem) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()

    ) {
        Column(
            modifier = Modifier
                .background(
                    color = Color(0xFFF2F2F28A)
                )
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Image(
                painter = painterResource(id =item.Image),
                contentDescription = null,
                alignment = Alignment.Center
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(item.price)
                Button(
                    onClick = {},
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black
                    ),
                    shape = ButtonDefaults.shape
                ) {
                    Text("BUY")
                }
            }
        }
        Text(item.title)

    }



}



