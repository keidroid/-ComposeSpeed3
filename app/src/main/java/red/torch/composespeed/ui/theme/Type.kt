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

private val nunitoFonts = FontFamily(
    Font(R.font.nunitosans_regular),
    Font(R.font.nunitosans_light, weight = FontWeight.Light),
    Font(R.font.nunitosans_semibold, weight = FontWeight.SemiBold),
    Font(R.font.nunitosans_bold, weight = FontWeight.Bold),
)

val myTypography = typographyFromDefaults(
    h1 = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 0.sp
    ),
    h2 = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.15.sp
    ),
    h3 = null, // unused
    h4 = null, // unused
    h5 = null, // unused
    h6 = null, // unused
    subtitle1 = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    subtitle2 = null, // unused
    body1 = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    body2 = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        letterSpacing = 1.sp
    ),
    caption = TextStyle(
        fontFamily = nunitoFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        letterSpacing = 1.sp
    ),
    overline = null, // unused
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
//                Text("H3 Headline", style = MaterialTheme.typography.h3)
//                Text("H4 Headline", style = MaterialTheme.typography.h4)
//                Text("H5 Headline", style = MaterialTheme.typography.h5)
//                Text("H6 Headline", style = MaterialTheme.typography.h6)
                Text("Subtitle 1", style = MaterialTheme.typography.subtitle1)
//                Text("Subtitle 2", style = MaterialTheme.typography.subtitle2)
                Text("Body 1", style = MaterialTheme.typography.body1)
                Text("Body 2", style = MaterialTheme.typography.body2)
                Text("Button", style = MaterialTheme.typography.button)
                Text("Caption", style = MaterialTheme.typography.caption)
//                Text("OVERLINE", style = MaterialTheme.typography.overline)
            }
        }
    }
}
