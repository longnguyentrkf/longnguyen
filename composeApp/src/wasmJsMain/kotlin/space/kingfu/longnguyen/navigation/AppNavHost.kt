package space.kingfu.longnguyen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import space.kingfu.longnguyen.home.viewModel.HomeViewModel
import space.kingfu.longnguyen.navigation.navGraphBuilder.homeGraph


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel
) {
    val navController = rememberNavController()


    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        homeGraph(
            vm = homeViewModel
        )
    }
}