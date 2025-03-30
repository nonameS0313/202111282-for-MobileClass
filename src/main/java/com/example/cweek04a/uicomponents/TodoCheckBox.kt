package com.example.cweek04a.uicomponents

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TodoCheckBox(
    checked: Boolean, modifier: Modifier = Modifier,
    onCheckedChange: (Boolean) -> Unit
) {
    Checkbox(checked = checked,
        onCheckedChange = { onCheckedChange(it) }
        )
}

@Preview
@Composable
private fun TodoCheckBox_prev() {
    TodoCheckBox(true) { }
}