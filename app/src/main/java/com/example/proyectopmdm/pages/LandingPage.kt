package com.example.proyectopmdm.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.myComponents.BookForYouCard
import com.example.proyectopmdm.myComponents.PageHeader
import com.example.proyectopmdm.myComponents.ReadingBookCard
import com.example.proyectopmdm.myComponents.SectionHeader
import com.example.proyectopmdm.myComponents.SummaryGrid
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro
import java.util.Date


@Composable

fun LandingPage(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(innerPadding)
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
            titulo = "El Principito",
            autor = "Antoine de Saint-Exupéry",
            sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
            paginasTotales = 100,
            paginasLeidas = 50,
            ultimaLectura = Date(2025 - 1900, 9, 24),
            portada = R.drawable.book
        )

        ReadingBookCard(
            libro = libroEjemplo,
            onClick = { },
            modifier = Modifier.padding(top = 8.dp)
        )

        SectionHeader(
            text = stringResource(id = R.string.header_resumen)
        )

        SummaryGrid(
            leyendo = 2,
            pendientes = 10,
            leidos = 5,
            onAddClick = {},
            modifier = Modifier.padding(top = 8.dp)
        )

        SectionHeader(
            text = stringResource(id = R.string.header_recomendados)
        )

        BookForYouCard(libro = libroEjemplo, onClick = { })


    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LandingPagePreview() {

    ProyectoPMDMTheme {
        Scaffold(
            modifier = Modifier
                .padding(horizontal = 16.dp))
        { innerPadding ->
            LandingPage(innerPadding = PaddingValues(0.dp))
        }
    }
}