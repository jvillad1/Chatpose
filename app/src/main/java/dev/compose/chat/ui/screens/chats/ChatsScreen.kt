package dev.compose.chat.ui.screens.chats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.compose.chat.Contact
import dev.compose.chat.R
import dev.compose.chat.ui.components.ScreenTitleText
import dev.compose.chat.ui.theme.ChatposeTheme

val contacts = listOf(
    Contact(""),
    Contact(""),
    Contact("")
)

@Composable
fun ChatsScreen() {
    Scaffold() {
        Column() {
            Spacer(modifier = Modifier.height(16.dp))
            ScreenTitleText(title = stringResource(R.string.chats_title))
            LazyRow() {
                contacts.forEach {

                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_2
)
@Composable
fun DefaultPreview() {
    ChatposeTheme(darkTheme = false) {
        ChatsScreen()
    }
}