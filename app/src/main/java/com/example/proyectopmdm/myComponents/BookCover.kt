package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun BookCover(
    portadaId: Int,
    titulo: String,
    modifier: Modifier = Modifier
) {

    Box(
        contentAlignment = Alignment.Center,

        modifier = modifier
            .fillMaxWidth()
            .height(270.dp)
            .background(MaterialTheme.colorScheme.surfaceContainerLow)
    ) {
        Card(
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier = Modifier
                .height(230.dp)
                .aspectRatio(2f / 3f)
        ) {
            Image(
                painter = painterResource(id = portadaId),
                contentDescription = titulo,
                modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BookCoverPreview() {
    ProyectoPMDMTheme {
        BookCover(
            portadaId = R.drawable.book,
            titulo = "El Principito"
        )
    }
}