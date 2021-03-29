package dev.compose.chat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import dev.compose.chat.ui.theme.ChatposeTheme

@Composable
fun CircularBox(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    content: @Composable() () -> Unit
) {
    Box(
        modifier = modifier
            .clickable {  }
            .background(color = backgroundColor, shape = CircleShape),
        contentAlignment = Alignment.Center
    ) {
        content()
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
        CircularBox(
            backgroundColor = Color.Green
        ) {
            Icon(imageVector = Icons.Default.Search, contentDescription = "")
        }
    }
}