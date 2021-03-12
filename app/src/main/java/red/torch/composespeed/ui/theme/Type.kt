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
package red.torch.composespeed.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import red.torch.composespeed.R

private val replyFonts = FontFamily(
    Font(R.font.worksans_regular, weight = FontWeight.Normal),
    Font(R.font.worksans_light, weight = FontWeight.Light),
    Font(R.font.worksans_medium, weight = FontWeight.Medium),
    Font(R.font.worksans_semibold, weight = FontWeight.SemiBold),
    Font(R.font.worksans_bold, weight = FontWeight.Bold),
)

val replyTypography = typographyFromDefaults(
    // TopBar
    h1 = TextStyle(
        fontFamily = replyFonts,
        fontSize = 96.sp,
        fontWeight = FontWeight.Light,
    ),
    h2 = TextStyle(
        fontFamily = replyFonts,
        fontSize = 60.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    h3 = null, // Unused
    h4 = null, // Unused
    h5 = null, // Unused
    h6 = null, // Unused
    subtitle1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    subtitle2 = null, // Unused
    body1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    caption = null, // Unused
    overline = null // Unused
)

fun typographyFromDefaults(
    h1: TextStyle?,
    h2: TextStyle?,
    h3: TextStyle?,
    h4: TextStyle?,
    h5: TextStyle?,
    h6: TextStyle?,
    subtitle1: TextStyle?,
    subtitle2: TextStyle?,
    body1: TextStyle?,
    body2: TextStyle?,
    button: TextStyle?,
    caption: TextStyle?,
    overline: TextStyle?
): Typography {
    val defaults = Typography()
    return Typography(
        h1 = defaults.h1.merge(h1),
        h2 = defaults.h2.merge(h2),
        h3 = defaults.h3.merge(h3),
        h4 = defaults.h4.merge(h4),
        h5 = defaults.h5.merge(h5),
        h6 = defaults.h6.merge(h6),
        subtitle1 = defaults.subtitle1.merge(subtitle1),
        subtitle2 = defaults.subtitle2.merge(subtitle2),
        body1 = defaults.body1.merge(body1),
        body2 = defaults.body2.merge(body2),
        button = defaults.button.merge(button),
        caption = defaults.caption.merge(caption),
        overline = defaults.overline.merge(overline)
    )
}

@Preview(widthDp = 640)
@Composable
fun TypographyPreview() {
    MyTheme {
        Surface {
            Column {
                Text("H1 Headline", style = MaterialTheme.typography.h1)
                Text("H2 Headline", style = MaterialTheme.typography.h2)
                Text("H3 Headline", style = MaterialTheme.typography.h3)
                Text("H4 Headline", style = MaterialTheme.typography.h4)
                Text("H5 Headline", style = MaterialTheme.typography.h5)
                Text("H6 Headline", style = MaterialTheme.typography.h6)
                Text("Subtitle 1", style = MaterialTheme.typography.subtitle1)
                Text("Subtitle 2", style = MaterialTheme.typography.subtitle2)
                Text("Body 1", style = MaterialTheme.typography.body1)
                Text("Body 2", style = MaterialTheme.typography.body2)
                Text("Button", style = MaterialTheme.typography.button)
                Text("Caption", style = MaterialTheme.typography.caption)
                Text("OVERLINE", style = MaterialTheme.typography.overline)
            }
        }
    }
}
