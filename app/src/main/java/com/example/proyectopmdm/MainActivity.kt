package com.example.proyectopmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.myComponents.PageHeader
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.proyectopmdm.myComponents.BottomAppBar
import com.example.proyectopmdm.myComponents.ReadingBookCard
import com.example.proyectopmdm.myComponents.SectionHeader
import com.example.proyectopmdm.pages.LaddingPage
import com.example.spotifyhome.model.Libro
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoPMDMTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.surface),
                    containerColor = MaterialTheme.colorScheme.surface,
                    bottomBar = {
                        BottomAppBar(
                            onSettingsClick = {},
                            onHomeClick = {},
                            onFavoriteClick = {},
                            onProfileClick = {},
                            onSearchClick = {}
                        )
                    }
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.background)
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                    {
                        val username = "Marcos"
                        val title = stringResource(id = R.string.bienvenida, username)
                        val subtitle = stringResource(id = R.string.has_leido)

                        PageHeader(
                            titleHeader = title,
                            subtitleText = subtitle,
                            modifier = Modifier
                                .padding(innerPadding)
                        )

                        SectionHeader(
                            text = stringResource(id = R.string.estas_leyendo)
                        )

                        val libroEjemplo = Libro(
                            id = 1,
                            titulo = "El Principito",
                            autor = "Antoine de Saint-Exupéry",
                            sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
                            paginasTotales = 100,
                            paginasLeidas = 50,
                            ultimaLectura = Date(2025 - 1900, 9, 24),
                            portada = R.drawable.book
                        )

                        ReadingBookCard(
                            libro = libroEjemplo,
                            onClick = { },
                            modifier = Modifier.padding(top = 120.dp)
                        )

                        SectionHeader(
                            text = stringResource(id = R.string.resumen_lectura)
                        )

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    ProyectoPMDMTheme {
        Scaffold(
            containerColor = MaterialTheme.colorScheme.surface,
            bottomBar = {
                BottomAppBar(
                    onSettingsClick = {},
                    onHomeClick = {},
                    onFavoriteClick = {},
                    onProfileClick = {},
                    onSearchClick = {}
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .background(MaterialTheme.colorScheme.surface)
            ) {
                val username = "Marcos"
                val title = stringResource(id = R.string.bienvenida, username)
                val subtitle = stringResource(id = R.string.has_leido)

                PageHeader(
                    titleHeader = title,
                    subtitleText = subtitle
                )

                SectionHeader(
                    text = stringResource(id = R.string.estas_leyendo)
                )

                val libroEjemplo = Libro(
                    id = 1,
                    titulo = "El Principito",
                    autor = "Antoine de Saint-Exupéry",
                    sinopsis = "Una historia sobre la infancia, la amistad y la esencia de la vida.",
                    paginasTotales = 100,
                    paginasLeidas = 50,
                    ultimaLectura = Date(2025 - 1900, 9, 24), // 24/10/2025
                    portada = R.drawable.book
                )

                ReadingBookCard(
                    libro = libroEjemplo,
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }
        }
    }
}