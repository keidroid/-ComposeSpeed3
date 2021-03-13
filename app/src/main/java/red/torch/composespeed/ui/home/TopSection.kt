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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.ui.theme.MyTheme
import red.torch.composespeed.ui.theme.green

@Composable
fun TopSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = colors.background)
    ) {
        Row {
            TopButton(stringId = R.string.home_account, true)
            TopButton(stringId = R.string.home_watch_list, false)
            TopButton(stringId = R.string.home_profile, false)
        }

        Text(
            text = stringResource(id = R.string.home_balance),
            style = typography.subtitle1,
            color = colors.onBackground,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 32.dp, bottom = 8.dp)
        )

        Text(
            text = "$73,589.01",
            style = typography.h1,
            color = colors.onBackground,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 48.dp, bottom = 24.dp)
        )

        Text(
            text = "+412.35 today",
            style = typography.subtitle1,
            color = green,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 16.dp, bottom = 32.dp)
        )

        Button(
            onClick = { /* nothing to do */ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colors.primary,
                contentColor = colors.onPrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(48.dp)
                .clip(RoundedCornerShape(percent = 50))
        ) {
            Text(
                stringResource(id = R.string.home_transact),
                style = typography.button,
            )
        }

        // Chips
        TopChips()

        Image(
            painter = painterResource(id = R.drawable.ic_home_illos),
            contentDescription = null,
        )

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
fun TopSectionDarkPreview() {
    MyTheme(darkTheme = true) {
        TopSection()
    }
}

@Composable
fun TopSectionLightPreview() {
    MyTheme(darkTheme = false) {
        TopSection()
    }
}
