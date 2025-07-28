package com.example.whatsappjc.presentation.callscreen

import android.media.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjc.R

@Preview(showSystemUi = true)
@Composable
fun FavoritesSection() {

    val sampleFavorites = listOf(
        FavoriteContact(image = R.drawable.sharadha_kapoor, name = "Sharadha Kapoor"),
        FavoriteContact(image = R.drawable.kartik_aaryan, name = "Kartik Aaryan"),
        FavoriteContact(image = R.drawable.mrbeast, name = "Mr Beast"),
        FavoriteContact(image = R.drawable.akshay_kumar, name = "Akshay Kumar"),
        FavoriteContact(image = R.drawable.bhuvan_bam, name = "Bhuvan Bam"),
        FavoriteContact(image = R.drawable.sharukh_khan, name = "Sharukh Khan"),

    )

    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
        Text(
            text = "Favorites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())) {

            sampleFavorites.forEach { FavoritesItem(it) }

        }
    }
}

data class FavoriteContact(val image: Int, val name: String)