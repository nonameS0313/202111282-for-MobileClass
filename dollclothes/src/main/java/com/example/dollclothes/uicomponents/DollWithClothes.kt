package com.example.dollclothes.uicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dollclothes.R
import com.example.dollclothes.model.OnCloth
import com.example.dollclothes.model.OnClothFactory

@Composable
fun DollWithClothes(ClothList: MutableList<OnCloth>, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.body),
            contentDescription = "",
            modifier = Modifier.size(400.dp)
        )
        ClothList.forEachIndexed {
            index, item ->
            if(item.OnChecked == true) {
                Image(
                    painter = painterResource(id = item.img),
                    contentDescription = "",
                    modifier = Modifier.size(400.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun DollWithClothes_prev() {
    DollWithClothes(OnClothFactory.makeOnClothList())
}

