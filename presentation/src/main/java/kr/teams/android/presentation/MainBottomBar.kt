package kr.teams.android.presentation

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import kr.teams.android.presentation.setting.SettingActivity
import kr.teams.android.presentation.ui.theme.AlbaringTheme

@Composable
fun MainBottomBar(
    navController: NavController,
) {
    val context = LocalContext.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route?.let { currentRoute ->
        MainRoute.entries.find { route -> route.route == currentRoute }
    } ?: MainRoute.HOME

    MainBottomBar(
        currentRoute = currentRoute,
        onItemClick = { newRoute ->
            when (newRoute) {

                //TODO 해당 화면 구현 상의 필요

                MainRoute.INFORMATION -> {
                    // INFORMATION에 대한 로직
                }

                MainRoute.SETTING -> {
                    // SETTING에 대한 로직
                    context.startActivity(
                        Intent(context, SettingActivity::class.java)
                    )
                }

                MainRoute.COMMUNITY -> {
                    // COMMUNITY 대한 로직
                }

                else -> {
                    navController.navigate(MainRoute.HOME.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        }
    )
}

@Composable
private fun MainBottomBar(
    currentRoute: MainRoute,
    onItemClick: (MainRoute) -> Unit,
) {
    Column {
        Divider()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            MainRoute.entries.forEach { route ->
                IconButton(
                    onClick = {
                        onItemClick(route)
                    }) {
                    Icon(
                        imageVector = route.icon,
                        contentDescription = route.contentDescription,
                        // 아이콘 클릭 시 색상 변경
                        tint = if (currentRoute == route) {
                            MaterialTheme.colorScheme.primary
                        } else {
                            Color.Gray
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun MainBottomBarPreview() {
    AlbaringTheme {
        Surface {
            var currentRoute by remember { mutableStateOf(MainRoute.HOME) }
            MainBottomBar(
                currentRoute = MainRoute.HOME,
                onItemClick = { newRoute -> currentRoute = newRoute }
            )
        }
    }
}