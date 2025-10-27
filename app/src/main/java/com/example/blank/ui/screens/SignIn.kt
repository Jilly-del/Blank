package com.example.blank.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.blank.R
import com.example.blank.ui.components.InputField
import com.example.blank.ui.components.NavigationButton

@Composable
fun SignIn( navController: NavController) {
    var email by remember { mutableStateOf("") }
    var passWord by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(top = 200.dp, start = 20.dp, end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .height(100.dp)
                .width(200.dp)
        )

        InputField(name = email, label = "email", onNameChange ={email = it} )
        InputField(name = passWord, label = "password", onNameChange ={passWord = it} )

        NavigationButton(
            title = "Login",
            onClick = {
                navController.navigate("home")
            }

        )
    }

}