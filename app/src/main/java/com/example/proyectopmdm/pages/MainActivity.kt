package com.example.proyectopmdm.pages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectopmdm.R
import com.example.proyectopmdm.myComponents.PageHeader
import com.example.proyectopmdm.ui.theme.CreamBackground
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoPMDMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .background(CreamBackground)
                            .fillMaxWidth()
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
        Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
            val username = "Marcos"
            val title = stringResource(id = R.string.bienvenida, username)
            val subtitle = stringResource(id = R.string.has_leido)

            PageHeader(
                titleHeader = title,
                subtitleText = subtitle,
                modifier = Modifier
            )
        }
    }
}