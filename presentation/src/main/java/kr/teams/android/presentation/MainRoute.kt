package kr.teams.android.presentation

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
    WORKPLACE(
        route = "WorkPlaceScreen",
        contentDescription = "WorkPlace",
        selectedIcon = R.drawable.ic_work_write_on,
        unSelectedIcon = R.drawable.ic_work_write_off
    ),
    COMMUNITY(
        route = "CommunityScreen",
        contentDescription = "Community",
        selectedIcon = R.drawable.ic_message_on,
        unSelectedIcon = R.drawable.ic_message_off
    ),
    SETTING(
        route = "SettingScreen",
        contentDescription = "Setting",
        selectedIcon = R.drawable.ic_user_on,
        unSelectedIcon = R.drawable.ic_user_off
    )
}