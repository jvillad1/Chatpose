package dev.compose.chat.ui.screens.messages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.compose.chat.ui.components.ScreenTitleText
import dev.compose.chat.ui.screens.chats.model.Contact
import dev.compose.chat.ui.screens.messages.model.Message
import dev.compose.chat.ui.theme.ChatposeTheme

val messages = listOf(
    Message(""),
    Message(""),
    Message(""),
    Message(""),
    Message("")
)

@Composable
fun MessagesScreen(contact: Contact) {
    Scaffold() {
        Column() {
            Spacer(modifier = Modifier.height(16.dp))
            ScreenTitleText(title = contact.name)
            Spacer(modifier = Modifier.height(32.dp))
            Surface(
                elevation = 8.dp,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)),
            ) {
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
        MessagesScreen(Contact(name = "Mauricio Flores"))
    }
}
