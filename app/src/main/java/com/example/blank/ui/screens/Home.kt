package com.example.blank.ui.screens



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.blank.ui.components.Header


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
        .padding(
             top = 80.dp,
             start = 20.dp,
             end = 20.dp
    ),
    ) {
        Header()
    }
}

