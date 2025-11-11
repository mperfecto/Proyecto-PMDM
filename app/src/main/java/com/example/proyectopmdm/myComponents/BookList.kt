package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro

@Composable
fun BookList(
    libros: List<Libro>,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        libros.forEach { libro ->
            ListBookCard(libro = libro)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BookListPreview() {

    val repo = LibrosRepo()
    val libros = repo.getLibros()

    ProyectoPMDMTheme {
        BookList(libros = libros)
    }
}