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

val themeMocks = listOf(
    Pair(R.drawable.desert_chic, "Desert Chic"),
    Pair(R.drawable.tiny_terrariums, "Tiny Terrariums"),
    Pair(R.drawable.jungle_vibes, "Jungle Vibes"),
    Pair(R.drawable.easy_care, "Easy care"),
    Pair(R.drawable.statements, "Statements")
)

val gardenMocks = listOf(
    Triple(R.drawable.monstera, "Monstera", true),
    Triple(R.drawable.tiny_terrariums, "Tiny terrariums", false),
    Triple(R.drawable.peace_lily, "Peace lily", false),
    Triple(R.drawable.fiddle_leaf_tree, "Fiddle leaf tree", false),
    Triple(R.drawable.snake_plant, "Snake plant", false),
    Triple(R.drawable.pothos, "Pothos", false)
)
