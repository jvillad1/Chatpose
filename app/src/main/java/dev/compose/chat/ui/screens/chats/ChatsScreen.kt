package dev.compose.chat.ui.screens.chats

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.compose.chat.ui.screens.chats.model.Contact
import dev.compose.chat.R
import dev.compose.chat.ui.components.ScreenTitleText
import dev.compose.chat.ui.screens.chats.components.ContactAvatar
import dev.compose.chat.ui.screens.chats.components.HorizontalContactsList
import dev.compose.chat.ui.theme.ChatposeTheme

val contacts = listOf(
    Contact(""),
    Contact(""),
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
            Spacer(modifier = Modifier.height(32.dp))
            Surface(
                elevation = 8.dp,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)),
            ) {
                val lazyState = rememberLazyListState()
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = lazyState,
                    contentPadding = PaddingValues(start = 32.dp, end = 32.dp, top = 64.dp)
                ) {
                    items(contacts.size) {
                        Row {
                            ContactAvatar(
                                contact = Contact(""),
                                modifier = Modifier
                                    .padding(bottom = 32.dp)
                                    .size(80.dp)
                            )
                            Spacer(Modifier.width(16.dp))
                            Column {
                                Row(
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Alaya Cordova",
                                        style = MaterialTheme.typography.h6,
                                        modifier = Modifier.alignByBaseline()
                                    )
                                    Text(
                                        text = "14:05",
                                        modifier = Modifier.alignByBaseline(),
                                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.6f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Hey There! What's up? Is everything ok?",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
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
