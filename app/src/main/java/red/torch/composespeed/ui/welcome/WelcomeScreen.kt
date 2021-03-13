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
package red.torch.composespeed.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import red.torch.composespeed.R
import red.torch.composespeed.ui.common.firstBaselineToTopAndBottom
import red.torch.composespeed.ui.theme.MyTheme
import red.torch.composespeed.ui.theme.pink900
import red.torch.composespeed.ui.theme.white

@Composable
fun WelcomeScreen(
    navController: NavController?,
) {
    val bg = if (colors.isLight) {
        R.drawable.ic_light_welcome_bg
    } else {
        R.drawable.ic_dark_welcome_bg
    }

    MyTheme {
        Scaffold {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colors.primary)
            ) {
                Image(
                    painter = painterResource(id = bg),
                    contentDescription = null,
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Spacer(modifier = Modifier.height(72.dp))

                    Row(
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Spacer(modifier = Modifier.width(88.dp))

                        val illos = if (colors.isLight) {
                            R.drawable.ic_light_welcome_illos
                        } else {
                            R.drawable.ic_dark_welcome_illos
                        }
                        Image(
                            painter = painterResource(id = illos),
                            contentDescription = null,
                            alignment = Alignment.TopStart,
                            contentScale = ContentScale.Crop,
                        )
                    }

                    Spacer(modifier = Modifier.height(48.dp))

                    val logo = if (colors.isLight) {
                        R.drawable.ic_light_logo
                    } else {
                        R.drawable.ic_dark_logo
                    }
                    Image(
                        painter = painterResource(id = logo),
                        contentDescription = null,
                    )

                    Text(
                        stringResource(id = R.string.welcome_subtitle),
                        style = typography.subtitle1,
                        modifier = Modifier
//                            .firstBaselineToTopAndBottom(32.dp, 40.dp)
                            .firstBaselineToTopAndBottom(24.dp, 40.dp) // 32? 24?
                    )

                    Button(
                        onClick = { /* nothing to do */ },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colors.secondary,
                            contentColor = colors.onSecondary
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(48.dp)
                            .clip(RoundedCornerShape(percent = 50))
                    ) {
                        Text(
                            stringResource(id = R.string.welcome_create_account),
                            style = typography.button,
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    val contentColor = if (colors.isLight) {
                        pink900
                    } else {
                        white
                    }
                    Button(
                        onClick = { navController?.navigate("login") },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Transparent,
                            contentColor = contentColor,
                        ),
                        elevation = ButtonDefaults.elevation(
                            defaultElevation = 0.dp,
                            pressedElevation = 0.dp,
                            disabledElevation = 0.dp,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(48.dp)
                            .clip(RoundedCornerShape(percent = 50))
                    ) {
                        Text(
                            stringResource(id = R.string.welcome_login),
                            style = typography.button,
                        )
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun WelcomeScreenLight() {
    MyTheme(darkTheme = false) {
        WelcomeScreen(navController = null)
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun WelcomeScreenDark() {
    MyTheme(darkTheme = true) {
        WelcomeScreen(navController = null)
    }
}
