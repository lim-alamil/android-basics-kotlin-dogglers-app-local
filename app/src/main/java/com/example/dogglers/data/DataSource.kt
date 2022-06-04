/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.dog1,
            "Nala",
            "3",
            "Strolling in the garden"
        ),

        Dog(
            R.drawable.dog2,
            "Kali",
            "1",
            "Sunbathing"
        ),

        Dog(
            R.drawable.dog3,
            "Snow",
            "2",
            "Playing in the snow"
        ),

        Dog(
            R.drawable.dog4,
            "Jake",
            "1",
            "Surfing"
        ),

        Dog(
            R.drawable.dog5,
            "Oreo",
            "1",
            "Playing tennis ball"
        ),

        Dog(
            R.drawable.dog7,
            "Chase",
            "3",
            "Playing frisbee"
        ),

        Dog(
            R.drawable.dog8,
            "Finn",
            "2",
            "Swimming"
        )

//        Dog(
//            R.drawable.tzeitel,
//            "Tzeitel",
//            "7",
//            "sunbathing"
//        ),
//        Dog(
//            R.drawable.leroy,
//            "Leroy",
//            "4",
//            "sleeping in dangerous places"
//        ),
//        Dog(
//            R.drawable.frankie,
//            "Frankie",
//            "2",
//            "stealing socks"
//        ),
//        Dog(
//            R.drawable.nox,
//            "Nox",
//            "8",
//            "meeting new animals"
//        ),
//        Dog(
//            R.drawable.faye,
//            "Faye",
//            "8",
//            "Digging in the garden"
//        ),
//        Dog(
//            R.drawable.bella,
//            "Bella",
//            "14",
//            "Chasing sea foam"
//        )
    )
}
