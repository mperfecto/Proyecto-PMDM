package com.example.proyectopmdm.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.example.proyectopmdm.myComponents.BookInfoSection
import com.example.proyectopmdm.myComponents.SectionHeader
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun BookPage(
    libro: Libro,
    innerPadding: PaddingValues
) {

    val scrollState = rememberScrollState()
    val betweenSpace = 5.dp

    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    val fechaPublicacionStr = dateFormat.format(libro.fechaPublicacion)

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
            modifier = Modifier.padding(top = betweenSpace, start = 16.dp, end = 16.dp)
        )

        AddLibroButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(56.dp)
                .width(175.dp)
                .padding(top = betweenSpace, start = 16.dp, end = 16.dp)
        )

        SectionHeader(
            text = "Descripcion",
            modifier = Modifier.padding(top = betweenSpace, start = 16.dp, end = 16.dp)
        )

        BookInfoSection(
            sinopsis = libro.sinopsis,
            fechaPublicacion = fechaPublicacionStr,
            paginas = libro.paginasTotales,
            isbn = libro.isbn,
            modifier = Modifier.padding(top = betweenSpace, start = 16.dp, end = 16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BookPagePreview() {

    val repo = LibrosRepo()
    val libroEjemplo = repo.getLibros().get(2)

    ProyectoPMDMTheme {
        BookPage(
            libro = libroEjemplo,
            innerPadding = PaddingValues(0.dp)
        )
    }
}
