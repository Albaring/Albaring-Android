package kr.teams.android.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Surface {
        Column(
            modifier = Modifier.padding(top = 28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "닉네임 님 환영합니다.",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 60.dp)
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.TopCenter
                ) {

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    "2024.05.01 - 2024.06.01",
                                    fontSize = 11.sp,
                                    color = Color.Gray
                                )
                                Icon(
                                    Icons.Default.Settings,
                                    contentDescription = "이미지 아이콘",
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                "상세한 정보에 대한 텍스트",
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp,

                                )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                "상세한 정보에 대한 텍스트",
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                repeat(3) {
                                    Button(
                                        onClick = { },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(0xFF6750A4)
                                        ),
                                        shape = RoundedCornerShape(50)
                                    ) {
                                        Icon(
                                            Icons.Default.Check,
                                            contentDescription = "체크 아이콘",
                                            tint = Color.White
                                        )
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text("확인", color = Color.White)
                                    }
                                }
                            }
                        }
                    }

                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .offset(y = (-50).dp)
                            .background(Color.Gray, CircleShape)
                            .padding(16.dp)
                    ) {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Person Icon",
                            modifier = Modifier.fillMaxSize(),
                            tint = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text("아이콘1", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(8.dp))
                HomeCard()
                Spacer(modifier = Modifier.height(16.dp))
                Text("아이콘2", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(8.dp))
                HomeCard()
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}