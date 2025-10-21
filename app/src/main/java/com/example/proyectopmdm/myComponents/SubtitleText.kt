package com.example.proyectopmdm.myComponents

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun SubtitleText(text: String, modifier: Modifier = Modifier) {

    Text(
        text = text,
        style = MaterialTheme.typography.headlineSmall,
        color = MaterialTheme.typography.headlineSmall.color,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier

    )

}