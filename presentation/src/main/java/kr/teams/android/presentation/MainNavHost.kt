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
import kr.teams.android.presentation.community.CommunityScreen
import kr.teams.android.presentation.home.HomeScreen
import kr.teams.android.presentation.information.InformationScreen
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

                    // TODO 사양이 빠뀔 수 있는 화면
                    composable(route = MainRoute.INFORMATION.route) {
                        InformationScreen()
                    }

                    composable(route = MainRoute.SETTING.route) {
                        SettingScreen()
                    }

                    // TODO 사양이 빠뀔 수 있는 화면
                    composable(route = MainRoute.COMMUNITY.route) {
                        CommunityScreen()
                    }

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