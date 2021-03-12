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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import red.torch.composespeed.R
import red.torch.composespeed.ui.detail.DogDetailScreen
import red.torch.composespeed.ui.list.DogListScreen
import red.torch.composespeed.viewmodel.DetailViewModel
import red.torch.composespeed.viewmodel.ListViewModel

@Composable
fun NavGraph(
    listViewModel: ListViewModel = viewModel(),
    detailViewModel: DetailViewModel = viewModel()
) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "list") {
        composable(
            "list"
        ) {
            DogListScreen(navController, listViewModel)
        }
        composable(
            "detail/{dogId}",
            arguments = listOf(navArgument("dogId") { type = NavType.IntType })
        ) {
            val dogId = it.arguments!!.getInt("dogId")
            DogDetailScreen(navController, dogId, detailViewModel)
        }
    }
}

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object List : Screen("list", R.string.screen_list)
    data class Detail(val dogId: Int) : Screen("detail/$dogId", R.string.screen_detail)
}
