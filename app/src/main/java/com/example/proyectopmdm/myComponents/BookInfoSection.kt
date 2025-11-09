package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.background
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
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
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
    ProyectoPMDMTheme {
        BookInfoSection(
            sinopsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                    "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                    "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
                    "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                    "mollit anim id est laborum.",
            paginas = 96,
            fechaPublicacion = "06/04/1943",
            isbn = "978-84-376-0494-7"
        )
    }

}