package com.example.blank.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blank.R

@Composable
fun Header() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                painter = painterResource(id = R.drawable.category),
                contentDescription = "background-image",
            )
            Image(
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "background-image",
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                )
                { append("Welcome") }
                append(" ")
                withStyle(
                    SpanStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 24.sp
                    )
                )
                { append("Back") }
            }

        )
        Text(
            "Jilly!",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp

        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.weight(3/4f),
            shape = CircleShape,
            leadingIcon = {
                Icon(
                    imageVector =
                        Icons.Default.Search, contentDescription = "Search"
                )
            },
            placeholder = { Text("Search") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Gray,
                unfocusedTextColor =Color.Black,
                focusedContainerColor = Color(0xFFF2F2F2),
                unfocusedContainerColor = Color(0xFFF2F2F2),
                unfocusedBorderColor = Color(0xFFBDBBBB),
                focusedBorderColor = Color(0xFF565353)

                )
        )
     Image(
         modifier = Modifier
             .width(40.dp)
             .height(40.dp)
             .padding(top = 10.dp),
         painter = painterResource(id = R.drawable.camera),
         contentDescription = null

     )
    }
}
}

