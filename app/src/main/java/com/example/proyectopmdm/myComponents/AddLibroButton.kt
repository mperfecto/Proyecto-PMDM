package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme


@Composable
fun AddLibroButton(
    text: String = stringResource(id = R.string.anhadir_a_biblioteca),
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
            .width(150.dp)
            .height(50.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Box(
                modifier = Modifier
                    .weight(2f)
                    .padding(start = 4.dp),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = text,
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.AddCircle,
                    contentDescription = text,
                    modifier = Modifier
                        .size(32.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddLibroButtonPreview() {
    ProyectoPMDMTheme {
        AddLibroButton(
            onClick = {}
        )
    }
}
