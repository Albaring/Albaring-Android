package kr.teams.android.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Send
import androidx.compose.ui.graphics.vector.ImageVector

enum class MainRoute(
    val route: String,
    val contentDescription: String,
    val selectedIcon: Int,
    val unSelectedIcon: Int,
) {
    HOME(
        route = "HomeScreen",
        contentDescription = "Home",
        selectedIcon = R.drawable.ic_home_on,
        unSelectedIcon = R.drawable.ic_home_off
    ),
    COMMUNITY(
        route = "CommunityScreen",
        contentDescription = "Community",
        selectedIcon = R.drawable.ic_message_on,
        unSelectedIcon = R.drawable.ic_message_off
    ),
    INFORMATION(
        route = "InformationScreen",
        contentDescription = "Information",
        selectedIcon = R.drawable.ic_bell_on,
        unSelectedIcon = R.drawable.ic_bell_off
    ),
    SETTING(
        route = "SettingScreen",
        contentDescription = "Setting",
        selectedIcon = R.drawable.ic_user_on,
        unSelectedIcon = R.drawable.ic_user_off
    )
}