package com.example.dollclothes.model

import androidx.compose.runtime.mutableStateListOf
import com.example.dollclothes.R

object OnClothFactory {
    fun makeOnClothList() =
        mutableStateListOf<OnCloth>(
            OnCloth(
                name = "nose",
                img = R.drawable.nose,
                OnChecked = false
            ),
            OnCloth(
                name = "arms",
                img = R.drawable.arms,
                OnChecked = false
            ),
            OnCloth(
                name = "ears",
                img = R.drawable.ears,
                OnChecked = false
            ),
            OnCloth(
                name = "eyebrows",
                img = R.drawable.eyebrows,
                OnChecked = false
            ),
            OnCloth(
                name = "eyes",
                img = R.drawable.eyes,
                OnChecked = false
            ),
            OnCloth(
                name = "glasses",
                img = R.drawable.glasses,
                OnChecked = false
            ),
            OnCloth(
                name = "hat",
                img = R.drawable.hat,
                OnChecked = false
            ),
            OnCloth(
                name = "mouth",
                img = R.drawable.mouth,
                OnChecked = false
            ),
            OnCloth(
                name = "mustache",
                img = R.drawable.mustache,
                OnChecked = false
            ),
            OnCloth(
                name = "shoes",
                img = R.drawable.shoes,
                OnChecked = false
            ),
        )

}