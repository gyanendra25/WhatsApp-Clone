package com.example.whatsappjc.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappjc.R
import com.example.whatsappjc.presentation.bottomnavigation.BottomNavigationBar

@Preview(showSystemUi = true)
@Composable
fun UpdateScreen() {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = colorResource(id = R.color.white)
            ) {
                Icon(painter = painterResource(R.drawable.baseline_photo_camera_24), contentDescription = null)
            }
        },
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        Column(modifier = Modifier.padding(it)) { }
    }
}