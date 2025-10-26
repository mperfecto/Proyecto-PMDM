package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme


@Composable
fun PageHeader(titleHeader: String, subtitleText: String, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .background(MaterialTheme.colorScheme.surfaceContainer)
    )
    {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            TitleHeader(text = titleHeader)
            SubtitleText(text = subtitleText)
        }
    }
}

@Preview
@Composable
fun PageHeaderPreview() {

    ProyectoPMDMTheme {

        Box() {
            val username = "Marcos"
            val title = stringResource(id = R.string.bienvenida, username)
            val subtitle = stringResource(id = R.string.has_leido)

            PageHeader(
                titleHeader = title,
                subtitleText = subtitle
            )
        }
    }
}