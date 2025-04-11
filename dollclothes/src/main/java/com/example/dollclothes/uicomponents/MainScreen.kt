package com.example.dollclothes.uicomponents

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dollclothes.model.DollViewModel
import com.example.dollclothes.model.OnClothFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier, dollViewModel: DollViewModel = viewModel()) {
    val orientation = LocalConfiguration.current.orientation
    val doll = dollViewModel.dollList

    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Box() {
            Text("202111282 노을영", fontSize = 20.sp)
            Column(
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                DollWithClothes(doll)
                CheckBoxTab(doll)
            }
        }
    } else {
        Row(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            DollWithClothes(doll)
            CheckBoxTab(doll)
        }
    }
}

@Preview
@Composable
private fun MainScreen_prev() {
    MainScreen()
}