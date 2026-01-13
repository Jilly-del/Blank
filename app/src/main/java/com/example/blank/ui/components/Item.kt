package com.example.blank.ui.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.blank.model.CartItems

@Composable
fun Items() {
    var cartItems = CartItems().items
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
    ) {
        items(cartItems){ item ->
            CartItemCard(item)


        }
    }
}