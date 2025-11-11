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
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme


@Composable

fun LandingPage(innerPadding: PaddingValues) {

    val scrollState = rememberScrollState()
    val betweenSpace = 5.dp

    val repo = LibrosRepo()
    val libros = repo.getLibros()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState)
            .padding(innerPadding)
            .padding(horizontal = 16.dp)
    ) {
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

        ReadingBookCard(
            libro = libros.first(),
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
            modifier = Modifier.padding(top = betweenSpace)
        )

        SectionHeader(
            text = stringResource(id = R.string.header_recomendados)
        )

        BooksForYouCarousel(
            libros = libros.drop(1),
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