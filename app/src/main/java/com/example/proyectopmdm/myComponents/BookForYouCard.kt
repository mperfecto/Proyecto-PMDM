package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro
import java.util.Date

@Composable
fun BookForYouCard(
    libro: Libro,
    modififier: Modifier = Modifier,
    onClick: () -> Unit
) {

    Column(
        modifier = modififier
            .width(140.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {

        Card(
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            modifier = Modifier
                .width(140.dp)
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp))
        ) {

            Image(
                painter = painterResource(id = libro.portada),
                contentDescription = libro.titulo,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(top = 4.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = libro.titulo,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = modififier.padding(bottom = 4.dp)
            )

            Text(
                text = libro.autor,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BookForYouCardPreview() {
    ProyectoPMDMTheme {
        val libroEjemplo = Libro(
            id = 1,
            titulo = "El Principito vestido de azul",
            autor = "Antoine de Saint-Exupéry",
            sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
            paginasTotales = 100,
            paginasLeidas = 50,
            ultimaLectura = Date(2025 - 1900, 9, 24),
            portada = R.drawable.book
        )

        BookForYouCard(
            libro = libroEjemplo,
            onClick = {}
        )
    }
}