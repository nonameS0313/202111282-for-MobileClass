package com.example.cweek04a.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TodoSwitch(
    checked: Boolean, modifier: Modifier = Modifier,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.End) {
        Text("미완료 항목만 보기",modifier = Modifier.padding(10.dp))
        Switch(checked = checked,
            onCheckedChange = { onCheckedChange(it) }
        )
    }
}

@Preview
@Composable
private fun TodoSwitch_prev() {
    TodoSwitch(true) { }
}