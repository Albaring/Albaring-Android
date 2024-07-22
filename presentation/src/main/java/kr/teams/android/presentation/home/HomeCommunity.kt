package kr.teams.android.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import kr.teams.android.domain.model.HomeCardModel
import kr.teams.android.presentation.ui.theme.AlbaringTheme
import kr.teams.android.presentation.ui.theme.Black_01
import kr.teams.android.presentation.ui.theme.Gray_02
import kr.teams.android.presentation.ui.theme.Gray_08
import kr.teams.android.presentation.ui.theme.Gray_09

@Composable
fun HomeCommunity() {
    val viewModel: HomeCardViewModel = hiltViewModel()
    ItemList(viewModel = viewModel)
}

@Composable
fun ItemList(viewModel: HomeCardViewModel) {
    val lazyPagingItems = viewModel.items.collectAsLazyPagingItems()
    Divider(color = Gray_02, thickness = 1.dp)
    LazyColumn(
        modifier = Modifier.background(Black_01)
    ) {
        items(
            count = lazyPagingItems.itemCount,
            key = lazyPagingItems.itemKey { it.id },
            contentType = lazyPagingItems.itemContentType { "ListItem" },
        ) { index ->
            val item = lazyPagingItems[index]
            item?.let {
                ListItemRow(it)
                Divider(color = Gray_02, thickness = 1.dp)
            }
        }
    }
}

@Composable
fun ListItemRow(item: HomeCardModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 12.dp,
                bottom = 12.dp,
                start = 12.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
                .background(Gray_08, CircleShape),
        ) {
            /*Icon(
                Icons.Default.Person,
                contentDescription = "Person Icon",
                tint = Color.White
            )*/
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = item.title,
            color = Gray_09,
            style = MaterialTheme.typography.titleSmall,
            lineHeight = 15.51.sp
        )
    }
}


@Preview
@Composable
private fun BoardScreenPreview() {
    AlbaringTheme {
        HomeCommunity()
    }
}