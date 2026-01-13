package com.example.blank.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blank.R

@Composable
fun HeroSection() {
    Row(
        modifier = Modifier
            .background(color = Color(0xFFE0DCDC))
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly

    ){

        Image(painter = painterResource(id = R.drawable.cover),
            contentDescription = null)
        Column(
            modifier = Modifier
                .height(200.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                        fontSize =25.sp,
                        fontWeight = FontWeight.ExtraBold
                          )
                      ){
                        append("New")
                    }
                    append(" ")

                    withStyle(
                        SpanStyle(
                            color = Color(0xFF7E7878),
                            fontSize =25.sp
                        )
                    ){
                        append("Collection")
                    }

                }
            )
            Text("Discount 50% for the first",
                fontWeight = FontWeight.Light,
                color = Color(0xFF282829)
            )

            Text("transaction",
                fontWeight = FontWeight.Light,
                color = Color(0xFF282829)
                )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                "show now",
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = CircleShape,
                    )
                    .background(color = Color.Black, shape = CircleShape)
                    .padding(horizontal = 10.dp, vertical = 5.dp)
                    .width(100.dp),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold

            )
        }
    }

}

