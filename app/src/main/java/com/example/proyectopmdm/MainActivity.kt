package com.example.proyectopmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectopmdm.myComponents.BottomAppBar
import com.example.proyectopmdm.myComponents.TopAppBar
import com.example.proyectopmdm.pages.BookPage
import com.example.proyectopmdm.pages.LandingPage
import com.example.proyectopmdm.pages.ListPage
import com.example.proyectopmdm.pages.LoginPage
import com.example.proyectopmdm.repo.LibrosRepo
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val librosRepo = LibrosRepo()
        val libroEjemplo = librosRepo.getLibros().first()

        setContent {
            ProyectoPMDMTheme {
                Scaffold(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surface),
                    containerColor = MaterialTheme.colorScheme.surface,

                    topBar = {
                        TopAppBar(
                            title = stringResource(id = R.string.app_name),
                            onSettingsClick = {}
                        )
                    },

                    bottomBar = {
                        BottomAppBar(
                            onHomeClick = {},
                            onFavoriteClick = {},
                            onProfileClick = {},
                            onSearchClick = {}
                        )
                    }
                ) { innerPadding ->

                    LandingPage(innerPadding)
                    //BookPage(libro = libroEjemplo, innerPadding)
                    //LoginPage(innerPadding)
                    //ListPage(innerPadding)

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {

    val librosRepo = LibrosRepo()
    val libroEjemplo = librosRepo.getLibros().first()

    ProyectoPMDMTheme {
        Scaffold(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface),
            containerColor = MaterialTheme.colorScheme.surface,

            topBar = {
                TopAppBar(
                    title = stringResource(id = R.string.app_name),
                    onSettingsClick = {}
                )
            },

            bottomBar = {
                BottomAppBar(
                    onHomeClick = {},
                    onFavoriteClick = {},
                    onProfileClick = {},
                    onSearchClick = {}
                )
            }
        ) { innerPadding ->

            //LandingPage(innerPadding)
            BookPage(libro = libroEjemplo, innerPadding)
            //LoginPage(innerPadding)
            //ListPage(innerPadding)

        }
    }
}