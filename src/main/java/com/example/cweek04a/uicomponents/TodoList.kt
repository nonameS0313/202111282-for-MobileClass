package com.example.cweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cweek04a.model.Item
import com.example.cweek04a.model.TodoItemFactory
import com.example.cweek04a.model.TodoStatus

@Composable
fun TodoList(todoList: MutableList<Item>, modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()
    var switchState by remember { mutableStateOf(false) }
    var (checkedState, onStateChange) = remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 0.dp)
            .verticalScroll(scrollState)
    ) {
        TodoSwitch(switchState) { SwitchChecked ->
            switchState = SwitchChecked
        }
        todoList.forEachIndexed { index, item ->
            if ((switchState == true && item.status == TodoStatus.PENDING) || switchState == false) {
                checkedState = item.status == TodoStatus.COMPLETED
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .toggleable(
                            value = checkedState,
                            onValueChange = { checkedState ->
                                todoList[index] = item.copy(
                                    status = if (checkedState) TodoStatus.COMPLETED
                                    else TodoStatus.PENDING
                                )
                            },
                            role = Role.Checkbox
                        )
                ) {
                    Row {
                        TodoCheckBox(checked = checkedState) { }
                        TodoItem(item = item)
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

        }
    }
}


@Preview
@Composable
private fun TodoList_prev() {
    TodoList(TodoItemFactory.makeTodoList())
}