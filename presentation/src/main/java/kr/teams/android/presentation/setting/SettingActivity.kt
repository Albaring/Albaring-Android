package kr.teams.android.presentation.setting

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kr.teams.android.presentation.ui.theme.AlbaringTheme

@AndroidEntryPoint
class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlbaringTheme {
                SettingScreen()
            }
        }
    }
}