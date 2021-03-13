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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.ui.theme.MyTheme
import red.torch.composespeed.ui.theme.iconMailOutline
import red.torch.composespeed.ui.theme.iconPassword

@Composable
fun LoginScreen(
    goHome: (() -> Unit)?,
) {
    Scaffold {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = colors.surface)
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_login_bg),
                    contentDescription = null,
                )

                Text(
                    text = stringResource(id = R.string.login_title),
                    style = typography.h2,
                    color = colors.onBackground,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.paddingFromBaseline(152.dp, 0.dp)
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                LoginTextField(
                    icon = iconMailOutline,
                    placeholderStringId = R.string.login_mail
                )

                Spacer(modifier = Modifier.height(8.dp))

                LoginTextField(
                    icon = iconPassword,
                    placeholderStringId = R.string.login_password
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { goHome?.invoke() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .clip(RoundedCornerShape(percent = 50))
                ) {
                    Text(
                        stringResource(id = R.string.common_login).toUpperCase(),
                        style = typography.button,
                    )
                }
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
