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
package red.torch.composespeed.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.ui.common.firstBaselineToTopAndBottom
import red.torch.composespeed.ui.theme.MyTheme

@Composable
fun LoginScreen(
    goHome: (() -> Unit)?,
) {
    Scaffold {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(
                stringResource(id = R.string.login_title),
                style = typography.h1,
                color = colors.onBackground,
                modifier = Modifier
                    .firstBaselineToTopAndBottom(184.dp, 16.dp) // 16?
            )

            LoginTextField(placeholderStringId = R.string.login_mail)

            Spacer(modifier = Modifier.height(8.dp))

            LoginTextField(placeholderStringId = R.string.login_password)

            LoginDescription()

            Button(
                onClick = { goHome?.invoke() },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colors.secondary,
                    contentColor = colors.onSecondary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .clip(RoundedCornerShape(percent = 50))
            ) {
                Text(
                    stringResource(id = R.string.common_login),
                    style = typography.button,
                )
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun WelcomeScreenLight() {
    MyTheme(darkTheme = false) {
        LoginScreen(goHome = null)
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun WelcomeScreenDark() {
    MyTheme(darkTheme = true) {
        LoginScreen(goHome = null)
    }
}
