package dev.compose.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices.PIXEL_2
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.compose.chat.ui.theme.ChatposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ChatsScreen()
                }
            }
        }
    }
}

data class Contact(private val url: String)

val contacts = listOf<Contact>(
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

@Composable
fun ScreenTitleText(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.h4,
        modifier = Modifier
            .padding(32.dp)
            .width(240.dp)
    )
}

@Composable
fun CircularBox() {
    Box(
        modifier = Modifier.background(color = Color.Blue, shape = CircleShape)
    ) {

    }
}

@Preview(
    showBackground = true,
    device = PIXEL_2
)
@Composable
fun DefaultPreview() {
    ChatposeTheme(darkTheme = true) {
        ChatsScreen()
    }
}

@Preview(
    showBackground = true,
    device = PIXEL_2,
    widthDp = 80,
    heightDp = 80
)
@Composable
fun CircularIconPreview() {
    ChatposeTheme(darkTheme = true) {
        CircularBox()
    }
}
