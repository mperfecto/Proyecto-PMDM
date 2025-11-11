package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun BookInfoSection(
    sinopsis: String,
    paginas: Int,
    fechaPublicacion: String,
    isbn: String,
    modifier: Modifier = Modifier
) {

    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
            contentColor = MaterialTheme.colorScheme.onSurface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier
            .padding(8.dp)
        ) {
            BookSinopsis(
                sinopsis = sinopsis
            )

            HorizontalDivider(
                color = MaterialTheme.colorScheme.outlineVariant,
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 20.dp)
            )

            BookDetalles(
                paginas = paginas,
                fechaPublicacion = fechaPublicacion,
                isbn = isbn
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BookInfoSectionPreview() {
    
    val repo = LibrosRepo()
    val libroEjemplo = repo.getLibros().first()
    
    ProyectoPMDMTheme {
        BookInfoSection(
            sinopsis = libroEjemplo.sinopsis,
            paginas = libroEjemplo.paginasTotales,
            fechaPublicacion = libroEjemplo.fechaPublicacion.toString(),
            isbn = libroEjemplo.isbn
        )
    }

}