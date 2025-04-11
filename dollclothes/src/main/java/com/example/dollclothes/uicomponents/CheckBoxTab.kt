package com.example.dollclothes.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dollclothes.model.OnCloth
import com.example.dollclothes.model.OnClothFactory
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxTab(itemList: MutableList<OnCloth>, modifier: Modifier = Modifier) {
//    val size = itemList.size / 2

    LazyVerticalGrid(
        modifier = Modifier.padding(20.dp, 0.dp),
        columns = GridCells.Fixed(2)
    ) {
        itemsIndexed(itemList) { index, item ->
            var check by remember { mutableStateOf(false) }
            check = item.OnChecked

            CheckboxForClothes(item, check) {
                check = it
                itemList[index] = item.copy(OnChecked = check)
            }
        }

    }
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceAround
//    ) {
//        Column {
//            itemList.forEachIndexed {
//                index, item ->
//                if(index < size){
//                    CheckboxForClothes(item) { }
//                }
//            }
//        }
//        Column {
//            itemList.forEachIndexed {
//                    index, item ->
//                if(index >= size){
//                    CheckboxForClothes(item) { }
//                }
//            }
//        }
//    }
}

@Preview
@Composable
private fun CheckBoxTab_prev() {
    CheckBoxTab(OnClothFactory.makeOnClothList())
}