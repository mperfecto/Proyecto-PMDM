package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.ui.theme.CreamBackground
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun TitleHeader(text: String) {



    Text(
        text = text,
        color = MaterialTheme.typography.bodyLarge.color,
        style = MaterialTheme.typography.bodyLarge,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.widthIn(LocalConfiguration.current.screenWidthDp.dp * 0.75f)
    )

}

@Preview
@Composable
fun TitleHeaderPreview() {
    TitleHeader(text = "Bienvenidx Marcos")
}