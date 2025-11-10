package com.example.proyectopmdm.myComponents

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.proyectopmdm.ui.theme.bodyMediumSemiBold
import com.example.spotifyhome.model.Libro
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun ListBookCard(
    libro: Libro,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    val fechaPublicacionStr = formatter.format(libro.fechaPublicacion)

    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
            contentColor = MaterialTheme.colorScheme.onSurface
        ),
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = libro.portada),
                contentDescription = libro.titulo,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 100.dp, height = 120.dp)
                    .clip(RoundedCornerShape(10.dp))
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .height(110.dp)
                    .padding(start = 25.dp, end = 12.dp)
            ) {
                Text(
                    text = libro.titulo,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
                Text(
                    text = libro.autor,
                    style = bodyMediumSemiBold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier
                        .padding(bottom = 15.dp)
                )

                Text(
                    text = stringResource(
                        R.string.paginas,
                        libro.paginasTotales
                    ),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )


                Text(
                    text = stringResource(
                        R.string.fecha_publicacion,
                        fechaPublicacionStr
                    ),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun ListBookCardPreview() {
    val repo = LibrosRepo()
    val libro = repo.getLibros().first()

    ProyectoPMDMTheme {
        ListBookCard(libro = libro)
    }
}