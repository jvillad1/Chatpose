package dev.compose.chat.ui.screens.chats.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.compose.chat.ui.screens.chats.model.Contact
import dev.compose.chat.ui.components.CircularBox

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
                    .size(56.dp),
                backgroundColor = Color.White.copy(alpha = 0.3f)
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)

                )
            }
        }
        itemsIndexed(contacts) { index, contact ->
            ContactAvatar(
                contact = contact,
                modifier = Modifier
                    .padding(end = if (index == contacts.size) 0.dp else 16.dp)
                    .size(56.dp)
            )
        }
    }
}

@Composable
fun ContactAvatar(contact: Contact, modifier: Modifier = Modifier) {
    CircularBox(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.primary
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "",
            tint = MaterialTheme.colors.onPrimary,
            modifier = Modifier.size(40.dp)
        )
    }
}
