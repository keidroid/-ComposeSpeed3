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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import red.torch.composespeed.R
import red.torch.composespeed.ui.home.HomeScreen
import red.torch.composespeed.ui.login.LoginScreen
import red.torch.composespeed.ui.welcome.WelcomeScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "welcome") {
        composable(
            "welcome"
        ) {
            WelcomeScreen {
                navController.navigate("login")
            }
        }
        composable(
            "login",
        ) {
            LoginScreen {
                navController.navigate("home")
            }
        }
        composable(
            "home",
        ) {
            HomeScreen()
        }
    }
}

sealed class Screen(val route: String, @StringRes val label: Int) {
    object Welcome : Screen("welcome", R.string.screen_welcome)
    object Login : Screen("login", R.string.screen_login)
    object Home : Screen("home", R.string.screen_home)
}
