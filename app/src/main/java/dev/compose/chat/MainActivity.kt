package dev.compose.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices.PIXEL_2
import androidx.compose.ui.tooling.preview.Preview
import dev.compose.chat.ui.components.CircularBox
import dev.compose.chat.ui.screens.chats.ChatsScreen
import dev.compose.chat.ui.theme.ChatposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatposeTheme {
                ChatsScreen()
            }
        }
    }
}
