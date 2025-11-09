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
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    Column(
        modifier = modifier
            .width(140.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = libro.portada),
            contentDescription = libro.titulo,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(140.dp)
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp))
        )

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
                modifier = modifier.padding(bottom = 4.dp),
                softWrap = true
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


@Preview(showBackground = true, backgroundColor = 0xFFDDDDDD)
@Composable
fun BookForYouCardPreview() {
    ProyectoPMDMTheme {
        val libroEjemplo = Libro(
            id = 1,
            isbn = "978-84-376-0494-7",
            titulo = "El Principito",
            autor = "Antoine de Saint-Exupéry",
            portada = R.drawable.book,
            sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
            fechaPublicacion = Date(1943 - 1900, 3, 6),
            paginasTotales = 100,
            paginasLeidas = 50,
            ultimaLectura = Date(2025 - 1900, 9, 24)
        )

        BookForYouCard(
            libro = libroEjemplo,
            onClick = {}
        )
    }
}