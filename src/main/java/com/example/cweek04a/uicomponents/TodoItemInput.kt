package com.example.cweek04a.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cweek04a.model.Item
import com.example.cweek04a.model.TodoItemFactory
import com.example.cweek04a.model.TodoStatus
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun TodoItemInput(todoList: MutableList<Item>, modifier: Modifier = Modifier) {
    var textFildState by remember { mutableStateOf("") }
    val currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm"))

    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        TextField(modifier = Modifier.weight(1f),
            value = textFildState,
            onValueChange = { content -> textFildState = content},
            placeholder = {Text(text = "할 일을 입력하세요")}
            )
        Spacer(modifier = Modifier.width(4.dp))
        Button(onClick = {todoList.add(Item(textFildState, currentTime, TodoStatus.PENDING))
        textFildState = ""}) {
            Text(text = "추가")
        }
    }
}

@Preview
@Composable
private fun TodoItemInput_Prev() {
    TodoItemInput(TodoItemFactory.makeTodoList())
}