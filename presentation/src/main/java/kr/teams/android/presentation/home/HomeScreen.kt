package kr.teams.android.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.teams.android.presentation.R
import kr.teams.android.presentation.ui.theme.Green_01

@Composable
fun HomeScreen() {
    Surface {
        Column(
            modifier = Modifier.padding(top = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_notification),
                    "ic_notification",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .aspectRatio(1f)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                // 더미 표기
                Text(
                    "닉네임",
                    textAlign = TextAlign.Center,
                    color = Green_01,
                    fontSize = 20.sp
                )

                Text(
                    "님 환영합니다.",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HomeCard()

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                        bottom = 16.dp,
                        start = 12.dp
                    )
                    .align(Alignment.Start)
            ) {
                // 더미
                Text(
                    text = "커피공장",
                    fontSize = 20.sp,
                )

                Text(
                    text = " 출근까지 ",
                    fontSize = 20.sp,
                )

                Text(
                    text = "3시간",
                    fontSize = 20.sp,
                    color = Green_01,
                )

                Text(
                    text = " 남았어요",
                    fontSize = 20.sp,
                )
            }

            Box(
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                        bottom = 10.dp,
                        start = 12.dp
                    )
                    .align(Alignment.Start)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_edit_contained),
                        "ic_edit_contained",
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                            .aspectRatio(1f)
                    )

                    Text(
                        "방금 올라온 커뮤니티 글",
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
            }

            Column {
                HomeCommunity()
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}