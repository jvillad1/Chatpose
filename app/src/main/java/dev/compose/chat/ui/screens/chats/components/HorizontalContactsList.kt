package dev.compose.chat.ui.screens.chats.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.compose.chat.Contact
import dev.compose.chat.R
import dev.compose.chat.ui.components.CircularBox
import dev.compose.chat.ui.components.ScreenTitleText

@Composable
fun HorizontalContactsList(
    contacts: List<Contact>,
    onSearchClicked: (() -> Unit) = {},
    onContactClicked: (Contact) -> Unit = {}
) {
    LazyRow(
        contentPadding = PaddingValues(start = 32.dp, end = 32.dp)
    ) {
        item {
            CircularBox(
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(40.dp),
                backgroundColor = Color.White.copy(alpha = 0.3f)
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "")
            }
        }
        itemsIndexed(contacts) { index, contact ->
            CircularBox(
                modifier = Modifier
                    .padding(end = if (index == contacts.size) 0.dp else 16.dp)
                    .size(40.dp),
                backgroundColor = Color.Blue
            ) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "")
            }
        }
    }
}