package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro
import java.util.Date

@Composable
fun BooksForYouCarousel(
    libros: List<Libro>,
    modifier: Modifier = Modifier,
    onItemClick: (Libro) -> Unit = {}
) {

    LazyRow(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(libros) { libro ->
            BookForYouCard(
                libro = libro,
                onClick = { onItemClick(libro) }
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BooksForYouCarouselPreview() {
    ProyectoPMDMTheme {
        val librosEjemplo = listOf(
            Libro(
                id = 1,
                titulo = "El Principito",
                autor = "Antoine de Saint-Exupéry",
                sinopsis = "",
                paginasTotales = 100,
                paginasLeidas = 50,
                ultimaLectura = Date(2025 - 1900, 9, 24),
                portada = R.drawable.book
            ),
            Libro(
                id = 2,
                titulo = "1984",
                autor = "George Orwell",
                sinopsis = "",
                paginasTotales = 200,
                paginasLeidas = 100,
                ultimaLectura = Date(2025 - 1900, 5, 12),
                portada = R.drawable.book
            ),
            Libro(
                id = 3,
                titulo = "Cien años de soledad",
                autor = "Gabriel García Márquez",
                sinopsis = "",
                paginasTotales = 300,
                paginasLeidas = 150,
                ultimaLectura = Date(2025 - 1900, 3, 8),
                portada = R.drawable.book
            ),
            Libro(
                id = 4,
                titulo = "La sombra del viento",
                autor = "Carlos Ruiz Zafón",
                sinopsis = "",
                paginasTotales = 400,
                paginasLeidas = 200,
                ultimaLectura = Date(2025 - 1900, 7, 15),
                portada = R.drawable.book
            ),
            Libro(
                id = 5,
                titulo = "Don Quijote de la Mancha",
                autor = "Miguel de Cervantes",
                sinopsis = "",
                paginasTotales = 800,
                paginasLeidas = 500,
                ultimaLectura = Date(2025 - 1900, 4, 1),
                portada = R.drawable.book
            )
        )

        BooksForYouCarousel(librosEjemplo)
    }
}
