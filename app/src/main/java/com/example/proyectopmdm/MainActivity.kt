package com.example.proyectopmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme
import com.example.proyectopmdm.myComponents.BottomAppBar
import com.example.proyectopmdm.myComponents.TopAppBar
import com.example.proyectopmdm.pages.LandingPage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoPMDMTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.surface)
                        .padding(horizontal = 16.dp),
                    containerColor = MaterialTheme.colorScheme.surface,

                    topBar = {
                        TopAppBar(
                            title = stringResource(id = R.string.app_name),
                            onSettingsClick = {}
                        )
                    },

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

                topBar = {
                    TopAppBar(
                        title = stringResource(id = R.string.app_name),
                        onSettingsClick = {}
                    )
                },

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