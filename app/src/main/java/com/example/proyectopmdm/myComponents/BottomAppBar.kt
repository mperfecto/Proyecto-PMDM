package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme


@Composable
fun BottomAppBar(
    onFavoriteClick: () -> Unit = {},
    onSearchClick: () -> Unit = {},
    onHomeClick: () -> Unit = {},
    onProfileClick: () -> Unit = {},
) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
        contentColor = MaterialTheme.colorScheme.secondary
    ) {

        val iconSize = 40.dp

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onFavoriteClick) {
                Icon(
                    painterResource(R.drawable.ic_library),
                    contentDescription = "Favorite",
                    modifier = Modifier.size(iconSize)
                )
            }
            IconButton(onClick = onSearchClick) {
                Icon(
                    painterResource(R.drawable.ic_search),
                    contentDescription = "Search",
                    modifier = Modifier.size(iconSize)
                )
            }
            IconButton(onClick = onHomeClick) {
                Icon(
                    painterResource(R.drawable.ic_home),
                    contentDescription = "Home",
                    modifier = Modifier.size(iconSize)
                )
            }
            IconButton(onClick = onProfileClick) {
                Icon(
                    painterResource(R.drawable.ic_account),
                    contentDescription = "Profile",
                    modifier = Modifier.size(iconSize)
                )
            }
        }
    }
}


@Preview
@Composable
fun MyBottomBarPreview() {
    ProyectoPMDMTheme {
        BottomAppBar()
    }
}