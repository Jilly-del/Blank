package com.example.blank.ui.screens



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.blank.ui.components.Header
import com.example.blank.ui.components.HeroSection
import com.example.blank.ui.components.Items


@Composable
fun Home() {
    Column(
        modifier = Modifier
        .padding(
             top = 80.dp
    ),
    ) {
        Header()
        Spacer(modifier = Modifier.height(20.dp))
        HeroSection()
        Items()

    }
}

