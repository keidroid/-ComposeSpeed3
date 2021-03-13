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

import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import red.torch.composespeed.ui.common.firstBaselineToTopAndBottom

@Composable
fun LoginDescription() {
    // stringResource(): Space does not work..
    Row(modifier = Modifier.firstBaselineToTopAndBottom(24.dp, 0.dp)) {
        Text(
            "By clicking below, you agree to our",
            style = MaterialTheme.typography.body2,
        )
        Text(
            "Terms of Use",
            style = MaterialTheme.typography.body2,
            textDecoration = TextDecoration.Underline,
        )
        Text(
            " and consent",
            style = MaterialTheme.typography.body2,
        )
    }
    Row(modifier = Modifier.firstBaselineToTopAndBottom(16.dp, 16.dp)) {
        Text(
            "to our ",
            style = MaterialTheme.typography.body2,
        )
        Text(
            "Privacy Policy",
            style = MaterialTheme.typography.body2,
            textDecoration = TextDecoration.Underline,
        )
    }
}
