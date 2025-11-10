package com.example.proyectopmdm.myComponents

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(vertical = 8.dp),
        modifier = modifier
    ) {
        items(libros) { libro ->
            ListBookCard(
                libro = libro
            )
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun BookListPreview() {

    val repo = LibrosRepo()
    val libros = repo.getLibros()

    ProyectoPMDMTheme {
        BookList(libros = libros)
    }
}