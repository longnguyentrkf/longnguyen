package space.kingfu.longnguyen.navigation.navGraphBuilder

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import space.kingfu.longnguyen.home.HomeScreen
import space.kingfu.longnguyen.home.viewModel.HomeViewModel
import space.kingfu.longnguyen.navigation.Screen


fun NavGraphBuilder.homeGraph(
    vm: HomeViewModel
) {
    composable(route = Screen.Home.route) {

        HomeScreen(
            theme = vm.state.theme,
            setTheme = vm::setTheme,
            firstName = vm.state.firstName,
            setFirstName = vm::setFirstName,
            lastName = vm.state.lastName,
            setLastName = vm::setLastName,
            message = vm.state.message,
            setMessage = vm::setMessage
        )
    }
}