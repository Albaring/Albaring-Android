package kr.teams.android.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.teams.android.presentation.ui.theme.Black_01
import kr.teams.android.presentation.ui.theme.Blue_01
import kr.teams.android.presentation.ui.theme.Green_01
import kr.teams.android.presentation.ui.theme.White_01

@Composable
fun HomeCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)
            .padding(10.dp),
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
                            color = Color.Gray,
                            lineHeight = 13.13.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // 더미 표기
                        Text(
                            "닉네임",
                            color = Black_01,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodyMedium,
                        )

                        Text(
                            "의 자산",
                            color = Black_01,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodyMedium,
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // 자산
                    Text(
                        "2,250,000 원",
                        color = Black_01,
                        style = MaterialTheme.typography.bodyLarge,
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    // 3개의 버튼
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(containerColor = Green_01),
                            shape = RoundedCornerShape(4.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .width(69.dp)
                                .height(22.dp)
                        ) {
                            Text(
                                "커피공장",
                                color = Black_01,
                                style = MaterialTheme.typography.bodySmall,
                            )
                        }

                        // 간격
                        Spacer(modifier = Modifier.width(8.dp))

                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(containerColor = Blue_01),
                            shape = RoundedCornerShape(4.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .width(52.dp)
                                .height(22.dp)
                        ) {
                            Text(
                                "CGV",
                                color = White_01,
                                style = MaterialTheme.typography.titleSmall,

                                )
                        }

                        // 간격
                        Spacer(modifier = Modifier.width(8.dp))

                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(containerColor = Blue_01),
                            shape = RoundedCornerShape(4.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .width(47.dp)
                                .height(22.dp)
                        ) {
                            Text(
                                "과외",
                                color = White_01,
                                style = MaterialTheme.typography.titleSmall,
                            )
                        }
                    }
                }
            }

            // 아이콘
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
}