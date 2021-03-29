package dev.compose.chat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import dev.compose.chat.ui.theme.ChatposeTheme

@Composable
fun CircularBox() {
    Box(
        modifier = Modifier.background(color = Color.Blue, shape = CircleShape)
    ) {

    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_2,
    widthDp = 80,
    heightDp = 80
)
@Composable
fun CircularIconPreview() {
    ChatposeTheme(darkTheme = true) {
        CircularBox()
    }
}