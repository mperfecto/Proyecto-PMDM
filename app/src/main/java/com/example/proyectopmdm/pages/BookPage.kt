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
import com.example.proyectopmdm.R
import com.example.proyectopmdm.myComponents.AddLibroButton
import com.example.proyectopmdm.myComponents.BookCover
import com.example.proyectopmdm.myComponents.BookHeaderInfo
import com.example.proyectopmdm.myComponents.BookInfoSection
import com.example.proyectopmdm.myComponents.SectionHeader
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro
import java.text.SimpleDateFormat
import java.util.Date
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


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookPagePreview() {

    val libroEjemplo = Libro(
        id = 1,
        isbn = "978-84-376-0494-7",
        titulo = "El Principito",
        autor = "Antoine de Saint-Exupéry",
        portada = R.drawable.book,
        sinopsis = "‘El Principito’ es una fábula poética sobre la inocencia, la amistad y el sentido de la vida. A través del encuentro entre un piloto perdido en el desierto y un misterioso niño proveniente de otro planeta, la historia explora temas como la soledad, el amor y la pérdida. Con un lenguaje sencillo pero profundamente simbólico, Saint-Exupéry invita al lector a redescubrir la mirada pura y curiosa de la infancia, recordándonos que “lo esencial es invisible a los ojos”.",
        fechaPublicacion = Date(1943 - 1900, 3, 6),
        paginasTotales = 100,
        paginasLeidas = 50,
        ultimaLectura = Date(2025 - 1900, 9, 24)
    )

    ProyectoPMDMTheme {
        BookPage(
            libro = libroEjemplo,
            innerPadding = PaddingValues(0.dp)
        )
    }

}
