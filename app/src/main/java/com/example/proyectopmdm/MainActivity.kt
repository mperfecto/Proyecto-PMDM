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
import com.example.proyectopmdm.myComponents.PageHeader
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.proyectopmdm.myComponents.BottomAppBar
import com.example.proyectopmdm.myComponents.ReadingBookCard
import com.example.proyectopmdm.myComponents.SectionHeader
import com.example.proyectopmdm.pages.LandingPage
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
                    LandingPage(innerPadding)
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
            ) { innerPadding ->
                LandingPage(innerPadding)
            }
        }
    }
}