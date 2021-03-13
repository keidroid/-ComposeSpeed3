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
package red.torch.composespeed.ui.home

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import red.torch.composespeed.ui.Screen
import red.torch.composespeed.ui.theme.MyTheme
import red.torch.composespeed.ui.theme.elevationNavigation

@Composable
fun HomeNavigationBar() {
    BottomNavigation(
        backgroundColor = colors.primary,
        elevation = elevationNavigation,
        modifier = Modifier.height(56.dp)
    ) {
        val navController = rememberNavController()
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
        val items = listOf(
            Screen.Home,
            Screen.Favorites,
            Screen.Profile,
            Screen.Cart,
        )
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = { Text(stringResource(screen.label)) },
                selected = currentRoute == screen.route,
                alwaysShowLabel = true,
                onClick = {
                    // nothing to do
                }
            )
        }
    }
}

@Preview
@Composable
fun HomeNavigationBarDarkPreview() {
    MyTheme(darkTheme = true) {
        HomeNavigationBar()
    }
}

@Preview
@Composable
fun HomeNavigationBarLightPreview() {
    MyTheme(darkTheme = false) {
        HomeNavigationBar()
    }
}
