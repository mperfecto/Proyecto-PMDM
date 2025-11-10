package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun FiltersRow(
    opciones: List<String>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(opciones) { opcion ->
            FilterCard(
                text = opcion,
                isSelected = false
            )
        }
    }
}


@Preview
@Composable
fun FiltersRowPreview() {
    val opciones = listOf("Favoritos", "Leídos", "Pendientes", "Leyendo")

    ProyectoPMDMTheme {
        FiltersRow(opciones = opciones)
    }
}