package com.example.blank.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.blank.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.blank.ui.components.NavigationButton

@Composable
fun GetStarted(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            modifier= Modifier.fillMaxSize(),
            painter = painterResource( id = R.drawable.background),
            contentDescription = "background-image",
            alpha = 0.7F

        )
//        Box(
//            modifier = Modifier
//                .background(color = Color(0x80262525))
//                .matchParentSize()
//        ){
//
//        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp,30.dp,20.dp,130.dp)
            ,
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacer(modifier= Modifier.height(200.dp))
            Text("Discover Quality Fashion",
                fontSize = 28.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Black
            )
            Text("Only the best of the best!",
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(80.dp))
            NavigationButton(
                title = "Get started",
                onClick = {
                  navController.navigate(route = "sign_up")
                }
            )
        }
    }

}