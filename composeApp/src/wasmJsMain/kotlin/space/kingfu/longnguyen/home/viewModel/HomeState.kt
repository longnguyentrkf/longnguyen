package space.kingfu.longnguyen.home.viewModel

import space.kingfu.longnguyen.ui.theme.ThemeType


data class HomeState(
    val theme: ThemeType = ThemeType.DARK,
    val firstName: String = "",
    val lastName: String = "",
    val message: String = ""
)