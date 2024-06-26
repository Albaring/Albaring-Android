package kr.teams.android.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kr.teams.android.presentation.home.HomeScreen
import kr.teams.android.presentation.setting.SettingScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainNavHost() {

    val navController = rememberNavController()

    Surface {
        Scaffold(
            content = { padding ->
                NavHost(
                    modifier = Modifier.padding(padding),
                    navController = navController,
                    startDestination = MainRoute.HOME.route,
                ) {
                    composable(route = MainRoute.HOME.route) {
                        HomeScreen()
                    }

                    // TODO 인포메이션 추가 필요

                    composable(route = MainRoute.SETTING.route) {
                        SettingScreen()
                    }

                    // TODO 커뮤니티 추가 필요

                }
            },
            bottomBar = {
                MainBottomBar(
                    navController = navController
                )
            }
        )
    }
}