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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.ui.theme.MyTheme
import red.torch.composespeed.ui.theme.elevationCard

@Composable
fun ThemeItem(
    @DrawableRes thumbnail: Int,
    title: String,
) {
    Card(
        shape = shapes.small,
        elevation = elevationCard,
        backgroundColor = colors.surface, // wrong?
        modifier = Modifier
            .size(136.dp)
            .padding(0.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = thumbnail),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
            )
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    title,
                    style = typography.h2,
                    maxLines = 1,
                )
            }
        }
    }
}

@Preview
@Composable
fun ThemeItemDarkPreview() {
    MyTheme(darkTheme = true) {
        ThemeItem(
            R.drawable.desert_chic,
            "Desert Chic"
        )
    }
}

@Preview("Light Theme")
@Composable
fun ThemeItemLightPreview() {
    MyTheme(darkTheme = false) {
        ThemeItem(
            R.drawable.desert_chic,
            "Desert Chic"
        )
    }
}
