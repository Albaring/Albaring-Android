package kr.teams.android.presentation

import android.graphics.Color.BLACK
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import dagger.hilt.android.AndroidEntryPoint
import kr.teams.android.presentation.ui.theme.AlbaringTheme

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlbaringTheme {
                MainNavHost()
            }
        }
        setStatusBarAndNavigationBarColors()
    }

    private fun setStatusBarAndNavigationBarColors() {
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val insetsController = WindowInsetsControllerCompat(window, window.decorView)

        // 탑 상태바 아이콘 및 텍스트를 하얀색으로 설정
        insetsController.isAppearanceLightStatusBars = false
        // 바텀 상태바 색상 설정
        window.navigationBarColor = BLACK
    }
}