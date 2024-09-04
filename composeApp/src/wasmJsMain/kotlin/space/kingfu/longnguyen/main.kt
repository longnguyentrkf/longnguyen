package space.kingfu.longnguyen

import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import space.kingfu.longnguyen.home.viewModel.HomeViewModel
import space.kingfu.longnguyen.navigation.AppNavHost
import space.kingfu.longnguyen.ui.theme.LongNguyenTheme


@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        val homeViewModel by remember { mutableStateOf(value = HomeViewModel()) }

        LongNguyenTheme(
            theme = homeViewModel.state.theme,
            content = {
                Surface {
                    AppNavHost(homeViewModel = homeViewModel)
                }
            }
        )
    }
}