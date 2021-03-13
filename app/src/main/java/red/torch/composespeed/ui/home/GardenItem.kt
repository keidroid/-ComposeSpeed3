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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import red.torch.composespeed.ui.theme.elevationCard

@Composable
fun GardenItem(
    @DrawableRes thumbnail: Int,
    title: String,
) {
    Card(
        shape = shapes.small,
        elevation = elevationCard,
        modifier = Modifier.size(136.dp)
    ) {
        Column {
            Box(
                modifier = Modifier.padding(8.dp)
            ) {
//                    DogListThumbnailImage(dog.thumbnailUrl)
            }

            Column(
                modifier = Modifier.padding(8.dp)
            ) {

                Text(
                    title,
                    style = typography.h2,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )

                Spacer(
                    Modifier
                        .height(4.dp)
                        .weight(1f)
                )
            }
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
