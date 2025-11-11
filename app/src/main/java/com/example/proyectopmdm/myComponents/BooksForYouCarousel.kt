package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro

@Composable
fun BooksForYouCarousel(
    libros: List<Libro>,
    modifier: Modifier = Modifier,
    onItemClick: (Libro) -> Unit = {}
) {

    LazyRow(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(libros) { libro ->
            BookForYouCard(
                libro = libro,
                onClick = { onItemClick(libro) }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BooksForYouCarouselPreview() {

    val repo = LibrosRepo()
    val librosEjemplo = repo.getLibros()

    ProyectoPMDMTheme {
        BooksForYouCarousel(
            librosEjemplo
        )
    }
}
