package com.example.proyectopmdm.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.myComponents.BooksForYouCarousel
import com.example.proyectopmdm.myComponents.PageHeader
import com.example.proyectopmdm.myComponents.ReadingBookCard
import com.example.proyectopmdm.myComponents.SectionHeader
import com.example.proyectopmdm.myComponents.SummaryGrid
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro
import java.util.Date


@Composable

fun LandingPage(innerPadding: PaddingValues) {

    val scrollState = rememberScrollState()
    val betweenSpace = 5.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState)
            .padding(horizontal = 16.dp)
    )
    {
        val username = "Marcos"
        val title = stringResource(id = R.string.bienvenida, username)
        val subtitle = stringResource(id = R.string.has_leido)

        PageHeader(
            titleHeader = title,
            subtitleText = subtitle,
            modifier = Modifier
                .padding(innerPadding)
        )

        SectionHeader(
            text = stringResource(id = R.string.header_leyendo)
        )

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

        ReadingBookCard(
            libro = libroEjemplo,
            onClick = { },
            modifier = Modifier.padding(top = betweenSpace)
        )

        SectionHeader(
            text = stringResource(id = R.string.header_resumen)
        )

        SummaryGrid(
            leyendo = 2,
            pendientes = 10,
            leidos = 5,
            onAddClick = {},
            modifier = Modifier.padding(top = betweenSpace)
        )

        SectionHeader(
            text = stringResource(id = R.string.header_recomendados)
        )

        val librosRecomendados = listOf(
            libroEjemplo,
            Libro(
                id = 2,
                isbn = "978-0-452-28423-4",
                titulo = "1984",
                autor = "George Orwell",
                sinopsis = "Una novela distópica sobre un régimen totalitario y la vigilancia extrema.",
                fechaPublicacion = Date(1949 - 1900, 5, 8),
                paginasTotales = 200,
                paginasLeidas = 100,
                ultimaLectura = Date(2025 - 1900, 5, 12),
                portada = R.drawable.book
            ),
            Libro(
                id = 3,
                isbn = "978-84-376-0494-8",
                titulo = "Cien años de soledad",
                autor = "Gabriel García Márquez",
                sinopsis = "La historia épica de la familia Buendía en el pueblo ficticio de Macondo.",
                fechaPublicacion = Date(1967 - 1900, 5, 30),
                paginasTotales = 300,
                paginasLeidas = 150,
                ultimaLectura = Date(2025 - 1900, 3, 8),
                portada = R.drawable.book
            ),
            Libro(
                id = 4,
                isbn = "978-84-08-03630-7",
                titulo = "La sombra del viento",
                autor = "Carlos Ruiz Zafón",
                sinopsis = "Un joven descubre un misterioso libro que cambiará su vida en la Barcelona de posguerra.",
                fechaPublicacion = Date(2001 - 1900, 4, 17),
                paginasTotales = 400,
                paginasLeidas = 200,
                ultimaLectura = Date(2025 - 1900, 7, 15),
                portada = R.drawable.book
            )
        )

        BooksForYouCarousel(
            libros = librosRecomendados,
            modifier = Modifier.padding(top = betweenSpace)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LandingPagePreview() {

    ProyectoPMDMTheme {
        Scaffold(
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        { innerPadding ->
            LandingPage(innerPadding = PaddingValues(0.dp))
        }
    }
}