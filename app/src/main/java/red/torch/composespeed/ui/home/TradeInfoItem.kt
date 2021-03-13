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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import red.torch.composespeed.R
import red.torch.composespeed.data.TradeInfo
import red.torch.composespeed.ui.theme.MyTheme

@Composable
fun TradeInfoItem(
    info: TradeInfo
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.height(56.dp)
        ) {
            Column(modifier = Modifier.width(64.dp)) {
                Text(
                    text = info.value1,
                    style = typography.body1,
                    color = colors.onSurface,
                    modifier = Modifier
                        .paddingFromBaseline(top = 24.dp)
                )

                var percentage = ""
                if (info.value2 >= 0f) {
                    percentage += "+"
                }
                percentage += info.value2
                percentage += "%"

                Text(
                    text = percentage,
                    style = typography.body1,
                    color = if (info.value2 >= 0f) {
                        colors.secondary
                    } else {
                        colors.onSecondary
                    },
                    modifier = Modifier
                        .paddingFromBaseline(top = 16.dp, bottom = 16.dp)
                )
            }

            Column {
                Text(
                    text = info.value3,
                    style = typography.h3,
                    color = colors.onSurface,
                    modifier = Modifier
                        .paddingFromBaseline(top = 24.dp)
                )

                Text(
                    text = info.value4,
                    style = typography.body1,
                    color = colors.onSurface,
                    modifier = Modifier
                        .paddingFromBaseline(top = 16.dp, bottom = 16.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxHeight()
            ) {
                Image(
                    painter = painterResource(id = info.value5),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview
@Composable
fun TradeInfoItemDarkPlusPreview() {
    val tradeInfo = TradeInfo(
        "\$1,293",
        4.18f,
        "BA",
        "Boeing Co.",
        R.drawable.ic_home_ba
    )
    MyTheme(darkTheme = true) {
        TradeInfoItem(tradeInfo)
    }
}

@Preview
@Composable
fun TradeInfoItemLightPlusPreview() {
    val tradeInfo = TradeInfo(
        "\$1,293",
        4.18f,
        "BA",
        "Boeing Co.",
        R.drawable.ic_home_ba
    )
    MyTheme(darkTheme = false) {
        TradeInfoItem(tradeInfo)
    }
}

@Preview
@Composable
fun TradeInfoItemDarkMinusPreview() {
    val tradeInfo = TradeInfo(
        "\$7,918",
        -0.54f,
        "ALK",
        "Alaska Air Group, Inc.",
        R.drawable.ic_home_alk
    )
    MyTheme(darkTheme = true) {
        TradeInfoItem(tradeInfo)
    }
}

@Preview
@Composable
fun TradeInfoItemLightMinusPreview() {
    val tradeInfo = TradeInfo(
        "\$7,918",
        -0.54f,
        "ALK",
        "Alaska Air Group, Inc.",
        R.drawable.ic_home_alk
    )
    MyTheme(darkTheme = false) {
        TradeInfoItem(tradeInfo)
    }
}
