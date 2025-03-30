package com.example.cweek04a.uicomponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cweek04a.R

@Preview
@Composable
private fun TodoListTitle_Prev() {
    TodoListTitle()
}

@Composable
fun TodoListTitle(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.todolist_title),
        fontSize = 24.sp,
        fontWeight = FontWeight.ExtraBold
    )
}
