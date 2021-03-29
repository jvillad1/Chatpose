package dev.compose.chat.ui.screens.chats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.compose.chat.Contact
import dev.compose.chat.R
import dev.compose.chat.ui.components.CircularBox
import dev.compose.chat.ui.components.ScreenTitleText
import dev.compose.chat.ui.screens.chats.components.HorizontalContactsList
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
            HorizontalContactsList(contacts)
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