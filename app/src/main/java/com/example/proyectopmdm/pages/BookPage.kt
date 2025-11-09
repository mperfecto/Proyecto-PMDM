package com.example.proyectopmdm.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.myComponents.AddLibroButton
import com.example.proyectopmdm.myComponents.BookCover
import com.example.proyectopmdm.myComponents.BookHeaderInfo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro

@Composable
fun BookPage(
    libro: Libro,
    innerPadding: PaddingValues
) {

    val scrollState = rememberScrollState()
    val betweenSpace = 5.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState)
            .padding(innerPadding),
    ) {
        BookCover(
            portadaId = libro.portada,
            titulo = libro.titulo
        )

        BookHeaderInfo(
            titulo = libro.titulo,
            autor = libro.autor,
            modifier = Modifier.padding(top = betweenSpace)
        )

        AddLibroButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = betweenSpace)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookPagePreview() {

    val libroEjemplo = Libro(
        id = 1,
        titulo = "El Principito",
        autor = "Antoine de Saint-Exupéry",
        sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
        paginasTotales = 100,
        paginasLeidas = 50,
        ultimaLectura = java.util.Date(2025 - 1900, 9, 24),
        portada = com.example.proyectopmdm.R.drawable.book
    )

    ProyectoPMDMTheme {
        BookPage(
            libro = libroEjemplo,
            innerPadding = PaddingValues(0.dp)
        )
    }

}
