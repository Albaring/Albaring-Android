package kr.teams.android.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import kr.teams.android.domain.model.HomeCardModel
import kr.teams.android.presentation.ui.theme.AlbaringTheme

@Composable
fun HomeCard() {
    val viewModel: HomeCardViewModel = hiltViewModel()
    ItemList(viewModel = viewModel)
}

@Composable
fun ItemList(viewModel: HomeCardViewModel) {
    val lazyPagingItems = viewModel.items.collectAsLazyPagingItems()

    LazyColumn {
        items(
            count = lazyPagingItems.itemCount,
            key = lazyPagingItems.itemKey { it.id },
            contentType = lazyPagingItems.itemContentType { "ListItem" }
        ) { index ->
            val item = lazyPagingItems[index]
            item?.let {
                ListItemRow(it)
                Divider(color = Color.Gray, thickness = 1.dp)
            }
        }
    }
}

@Composable
fun ListItemRow(item: HomeCardModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Gray, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Default.Person,
                contentDescription = "Person Icon",
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = item.title)
    }
}


@Preview
@Composable
private fun BoardScreenPreview() {
    AlbaringTheme {
        HomeCard()
    }
}