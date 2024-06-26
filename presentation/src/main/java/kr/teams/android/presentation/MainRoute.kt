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
    val route:String,
    val contentDescription:String,
    val icon: ImageVector
) {
    HOME(route = "HomeScreen", contentDescription = "Home", icon = Icons.Filled.Home),
    INFORMATION(route = "InformationScreen", contentDescription = "Information", icon = Icons.Filled.Info),
    COMMUNITY(route = "CommunityScreen", contentDescription = "Community", icon = Icons.Filled.Send),
    SETTING(route = "SettingScreen", contentDescription = "Setting", icon = Icons.Filled.AccountCircle)
}