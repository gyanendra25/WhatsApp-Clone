package com.example.whatsappjc.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjc.R
import com.example.whatsappjc.presentation.bottomnavigation.BottomNavigationBar

@Preview(showSystemUi = true)
@Composable
fun UpdateScreen() {

    val scrollState = rememberScrollState()

    val sampleStatus = listOf(
        StatusData(image = R.drawable.disha_patani, name = "Disha Patani", time = "10 min ago"),
        StatusData(image = R.drawable.rashmika, name = "Rashmika ", time = "20 min ago"),
        StatusData(image = R.drawable.bhuvan_bam, name = "Disha Patani", time = "5 min ago")
    )

    val sampleChannel = listOf(
        Channel(image = R.drawable.img, name = "Food lover", description = "Discover new recipes"),
        Channel(image = R.drawable.meta, name = "Meta", description = "Explore the world"),
        Channel(image = R.drawable.neat_roots, name = "Neat Roots", description = "Latest news"),
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = colorResource(id = R.color.white)
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = null
                )
            }
        },
        bottomBar = {
            BottomNavigationBar()
        },
        topBar = {
            TopBar()
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {

            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            MyStatus()

            sampleStatus.forEach { data ->
                StatusItem(statusData = data)
            }

            Spacer(modifier = Modifier.height(16.dp))

            HorizontalDivider(color = Color.Gray)

            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(text = "Stay updated on topics that matter to you. Find channels to follow below")

                Spacer(modifier = Modifier.height(32.dp))

                Text(text = "Find channels to follow")
            }

            Spacer(modifier = Modifier.height(16.dp))

            sampleChannel.forEach {
                ChannelItemDesign(channel = it)
            }
        }
    }
}