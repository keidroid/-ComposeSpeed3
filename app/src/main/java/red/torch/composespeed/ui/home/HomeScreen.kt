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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.data.tradeInfoMocks
import red.torch.composespeed.ui.theme.MyTheme

@Composable
fun HomeScreen() {
    Scaffold {
        LazyColumn {
            // Top
            item {
                MyTheme { // bug?
                    TopSection()
                }
            }

            // Positions Title
            item {
                MyTheme { // bug?
                    Text(
                        text = stringResource(id = R.string.home_positions),
                        style = MaterialTheme.typography.subtitle1,
                        color = colors.onSurface,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = colors.surface)
                            .paddingFromBaseline(top = 40.dp, bottom = 24.dp)
                    )
                }
            }
            // Positions Contents
            tradeInfoMocks.forEach {
                item {
                    MyTheme { // bug?
                        Column(modifier = Modifier.background(color = colors.surface)) {
                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(1.dp)
                                    .padding(horizontal = 16.dp)
                            )
                            TradeInfoItem(info = it)
                        }
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
        HomeScreen()
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun WelcomeScreenDark() {
    MyTheme(darkTheme = true) {
        HomeScreen()
    }
}
