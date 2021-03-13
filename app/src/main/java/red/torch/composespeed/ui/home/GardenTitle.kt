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

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.ui.common.firstBaselineToTopAndBottom
import red.torch.composespeed.ui.theme.MyTheme
import red.torch.composespeed.ui.theme.iconFilterList

@Composable
fun GardenTitle() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Text(
            stringResource(id = R.string.home_design_your_home_garden),
            style = typography.h1,
            modifier = Modifier
                .firstBaselineToTopAndBottom((40 - 16).dp, 8.dp) // theme list padding
        )
        Spacer(modifier = Modifier.weight(1f))

        Box(
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = iconFilterList,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview
@Composable
fun GardenTitleDarkPreview() {
    MyTheme(darkTheme = true) {
        GardenTitle()
    }
}

@Preview
@Composable
fun GardenTitleLightPreview() {
    MyTheme(darkTheme = false) {
        GardenTitle()
    }
}
