package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.spotifyhome.model.Libro
import java.util.Date

@Composable
fun BookForYouComponent(libro: Libro, modifier: Modifier) {
    Box(modifier = modifier
        .width(130.dp)
        .height(240.dp)
        .padding(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
        ) {

            Image(
                painter = painterResource(id = libro.portada),
                contentDescription = libro.titulo,
                modifier = modifier
                    .size(170.dp)
                    .clip(RoundedCornerShape(10.dp)),
                alignment = Alignment.TopStart
            )

            Text(
                text = libro.titulo,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            Text(
                text = libro.autor,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BookForYouComponentPreview() {
    MaterialTheme {
        val libroEjemplo = Libro(
            id = 1,
            titulo = "El Principito",
            autor = "Antoine de Saint-Exupéry",
            sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
            paginasTotales = 100,
            paginasLeidas = 50,
            ultimaLectura = Date(2025 - 1900, 9, 24),
            portada = R.drawable.book
        )

        BookForYouComponent(libroEjemplo, modifier = Modifier)
    }

}