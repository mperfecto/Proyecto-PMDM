package com.example.proyectopmdm.pages

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.myComponents.BookList
import com.example.proyectopmdm.myComponents.FieldCard
import com.example.proyectopmdm.myComponents.FiltersRow
import com.example.proyectopmdm.myComponents.OrdenarCard
import com.example.proyectopmdm.myComponents.TitleHeader
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.spotifyhome.model.Libro

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ListPage(innerPadding: PaddingValues, libros: List<Libro>) {

    val scrollState = rememberScrollState()
    val betweenSpace = 5.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState)
            .padding(horizontal = 16.dp)
    ) {

        TitleHeader(
            text = stringResource(id = R.string.tu_biblioteca),
            modifier = Modifier
                .padding(innerPadding)
        )

        FiltersRow(
            opciones = listOf("Favoritos", "Leídos", "Pendientes", "Leyendo"),
            modifier = Modifier.padding(top = betweenSpace)
        )

        FieldCard(
            placeholder = stringResource(id = R.string.buscar),
            icon = Icons.Default.Search,
            onIconClick = {},
            modifier = Modifier.padding(top = betweenSpace)
        )

        OrdenarCard(
            text = stringResource(id = R.string.ordenar),
            modifier = Modifier
                .padding(top = betweenSpace)
                .align(Alignment.End)
        )

        BookList(
            libros = libros,
            modifier = Modifier.padding(top = betweenSpace)
        )
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun ListPagePreview() {

    val repo = LibrosRepo()
    val libros = repo.getLibros()

    ProyectoPMDMTheme {
        ListPage(innerPadding = PaddingValues(0.dp), libros = libros)
    }
}