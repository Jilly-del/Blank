package com.example.blank.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.blank.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.blank.ui.components.InputField
import com.example.blank.ui.components.NavigationButton
import com.example.blank.viewmodel.MainViewModel


@Composable
fun SignUp(navController: NavController, viewModel: MainViewModel) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var telePhone by remember { mutableStateOf("") }
    var passWord by remember { mutableStateOf("") }
    var confirmPassWord by remember { mutableStateOf("") }
    var check by remember { mutableStateOf(true) }
    Column( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(top = 100.dp, start = 20.dp, end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .height(100.dp)
                .width(200.dp)
        )

        InputField(name = firstName, label = "firstName", onNameChange ={firstName = it} )
        InputField(name = lastName, label = "LastName", onNameChange ={lastName = it} )
        InputField(name = email, label = "email", onNameChange ={email = it} )
        InputField(name = telePhone, label = "telephone", onNameChange ={telePhone = it} )
        InputField(name = passWord, label = "password", onNameChange ={passWord = it} )
        InputField(name = confirmPassWord, label = "confirm password", onNameChange ={confirmPassWord = it} )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Checkbox(checked = check, onCheckedChange = {check = it})
            Text("I agree to the Terms and Conditions", color = Color.Black)
        }
        NavigationButton(
            title = "Register",
            onClick = {
                navController.navigate(route = "sign_in")
                viewModel.saveUsername(firstName)


            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(buildAnnotatedString {
            withStyle(
                SpanStyle(color = Color.Black)
            ) {
                append("Already have an account?") }
            append(" ")
            withStyle (
                SpanStyle(color = Color.Blue)
        ){
                append("Sign In")
            }


}
            )
        }
}