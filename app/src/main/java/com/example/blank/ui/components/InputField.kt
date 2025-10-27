package com.example.blank.ui.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp


@Composable
fun InputField(name: String, label: String, onNameChange: (String) -> Unit ) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth()
            .padding(bottom = 10.dp),
        value = name,
        onValueChange = onNameChange,
        label = {Text(label, color = Color.Black )},
        shape = RoundedCornerShape(10.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Black,
            focusedBorderColor = Color.Black,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black
        )

    )





}