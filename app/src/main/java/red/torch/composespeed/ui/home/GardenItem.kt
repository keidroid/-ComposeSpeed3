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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GardenItem(
    @DrawableRes thumbnail: Int,
    title: String,
) {
    Row {
        Image(
            painter = painterResource(id = thumbnail),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.size(64.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Box {
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
    }
}

// @Preview("Dark Theme")
// @Composable
// fun DogListContentsItemDarkPreview() {
//    val dog = DogSimpleInfo(
//        id = 123,
//        thumbnailUrl = "",
//        title = "title",
//        location = "location",
//        features = "features",
//    )
//    MyTheme(darkTheme = true) {
//        DogListContentsItem(dog) {
//        }
//    }
// }
//
// @Preview("Light Theme")
// @Composable
// fun DogListContentsItemLightPreview() {
//    val title =
//    MyTheme(darkTheme = false) {
//        ThemeItem(R.drawable."title") {
//        }
//    }
// }
