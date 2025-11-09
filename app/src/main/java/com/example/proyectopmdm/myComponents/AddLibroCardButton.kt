package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme


@Composable
fun AddLibroCardButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimaryContainer,
            contentColor = MaterialTheme.colorScheme.surfaceContainerHigh
        ),
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = stringResource(id = R.string.anhadir_libro),
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )
            Icon(
                imageVector = Icons.Filled.AddCircle,
                contentDescription = "Añadir libro",
                modifier = Modifier
                    .size(20.dp)
                    .clickable { onClick() }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddLibroCardPreview() {
    ProyectoPMDMTheme {
        AddLibroCardButton(onClick = {})
    }
}