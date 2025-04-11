package com.example.dollclothes.uicomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dollclothes.model.OnCloth

@Composable
fun CheckboxForClothes(item: OnCloth, check: Boolean, modifier: Modifier = Modifier, OnCheckedEvent:(Boolean)->Unit) {

    Row(
        modifier = Modifier.padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = check,
            onCheckedChange = OnCheckedEvent
        )
        Text(item.name)
    }
}

@Preview
@Composable
private fun CheckboxForClothes_prev() {
    CheckboxForClothes(OnCloth(
        name = "Nose",
        img = 1,
        OnChecked = true
    ), false){}
}