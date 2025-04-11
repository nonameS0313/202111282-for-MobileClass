package com.example.dollclothes.model

import androidx.lifecycle.ViewModel

class DollViewModel : ViewModel() {
    private val _dollList = OnClothFactory.makeOnClothList()

    val dollList: MutableList<OnCloth>
        get() = _dollList
}