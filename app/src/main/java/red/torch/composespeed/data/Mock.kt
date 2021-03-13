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
package red.torch.composespeed.data

import red.torch.composespeed.R

val chipMocks = listOf(
    Pair("Week", true),
    Pair("ETFs", false),
    Pair("Stocks", false),
    Pair("Funds", false),
    Pair("Mock1", false),
)

val tradeInfoMocks = listOf(
    TradeInfo("\$7,918", -0.54f, "ALK", "Alaska Air Group, Inc.", R.drawable.ic_home_alk),
    TradeInfo("\$1,293", 4.18f, "BA", "Boeing Co.", R.drawable.ic_home_ba),
    TradeInfo("\$893.50", -0.54f, "DAL", "Delta Airlines Inc.", R.drawable.ic_home_dal),
    TradeInfo("\$12,301", 2.51f, "EXPE", "Expedia Group Inc.", R.drawable.ic_home_exp),
    TradeInfo("\$12,301", 1.38f, "EADSY", "Airbus SE", R.drawable.ic_home_eadsy),
    TradeInfo("\$8,521", 1.56f, "JBLU", "Jetblue Airways Corp.", R.drawable.ic_home_jblu),
    TradeInfo("\$521", 2.75f, "MAR", "Marriott International Inc.", R.drawable.ic_home_mar),
    TradeInfo("\$5,481", 0.14f, "CCL", "Carnival Corp", R.drawable.ic_home_ccl),
    TradeInfo("\$9,184", 1.69f, "RCL", "Royal Caribbean Cruises", R.drawable.ic_home_rcl),
    TradeInfo("\$654", 3.23f, "TRVL", "Travelocity Inc.", R.drawable.ic_home_trvl),
)
