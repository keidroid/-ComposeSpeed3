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

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.ui.theme.MyTheme

@Composable
fun GardenItem(
    @DrawableRes thumbnail: Int,
    title: String,
    checked: Boolean
) {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Row(
            modifier = Modifier
                .height(64.dp)
        ) {
            Image(
                painter = painterResource(id = thumbnail),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(shapes.small)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Box(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        title,
                        style = typography.h2,
                        maxLines = 1,
                        modifier = Modifier
                            .fillMaxHeight()
                            .paddingFromBaseline(top = 24.dp)
                    )

                    Text(
                        "This is a description",
                        style = typography.body1,
                        maxLines = 1,
                        modifier = Modifier
                            .fillMaxHeight()
                            .paddingFromBaseline(bottom = 24.dp)
                    )
                }
                Box(
                    contentAlignment = Alignment.BottomEnd,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Checkbox(
                        checked = checked,
                        onCheckedChange = { /* nothing to do */ },
                        colors = CheckboxDefaults.colors(
                            checkmarkColor = colors.onSecondary // oops!
                        ),
                        modifier = Modifier.padding(bottom = 24.dp)
                    )

                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview
@Composable
fun GardenItemDarkCheckOnPreview() {
    MyTheme(darkTheme = true) {
        GardenItem(R.drawable.monstera, "Monstera", true)
    }
}

@Preview
@Composable
fun GardenItemLightCheckOnPreview() {
    MyTheme(darkTheme = false) {
        GardenItem(R.drawable.monstera, "Monstera", true)
    }
}

@Preview
@Composable
fun GardenItemDarkCheckOffPreview() {
    MyTheme(darkTheme = true) {
        GardenItem(R.drawable.tiny_terrariums, "Tiny Terrariums", false)
    }
}

@Preview
@Composable
fun GardenItemLightCheckOffPreview() {
    MyTheme(darkTheme = false) {
        GardenItem(R.drawable.tiny_terrariums, "Tiny Terrariums", false)
    }
}
