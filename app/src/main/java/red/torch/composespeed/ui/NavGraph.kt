/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package red.torch.composespeed.ui

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import red.torch.composespeed.R
import red.torch.composespeed.ui.theme.iconAccountCircle
import red.torch.composespeed.ui.theme.iconFavoriteBorder
import red.torch.composespeed.ui.theme.iconHome
import red.torch.composespeed.ui.theme.iconShoppingCart
import red.torch.composespeed.ui.welcome.WelcomeScreen
import red.torch.composespeed.viewmodel.DetailViewModel
import red.torch.composespeed.viewmodel.ListViewModel

@Composable
fun NavGraph(
    listViewModel: ListViewModel = viewModel(),
    detailViewModel: DetailViewModel = viewModel()
) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "welcome") {
        composable(
            "welcome"
        ) {
            WelcomeScreen(navController)
        }
        composable(
            "login",
        ) {
//            DogDetailScreen(navController, 1, detailViewModel)
        }
        composable(
            "home",
        ) {
//            DogDetailScreen(navController, 1, detailViewModel)
        }
    }
}

sealed class Screen(val route: String, @StringRes val label: Int, val icon: ImageVector) {
    object Welcome : Screen("welcome", R.string.screen_welcome, iconHome)
    object Login : Screen("login", R.string.screen_login, iconHome)
    object Home : Screen("home", R.string.screen_home, iconHome)
    object Favorites : Screen("favorites", R.string.screen_favorites, iconFavoriteBorder)
    object Profile : Screen("profile", R.string.screen_profile, iconAccountCircle)
    object Cart : Screen("cart", R.string.screen_cart, iconShoppingCart)
}
