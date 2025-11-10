package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun SummaryGrid(
    leyendo: Int,
    pendientes: Int,
    leidos: Int,
    onAddClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SummaryCard(
                textId = R.string.cantidad_leyendo,
                value = leyendo,
                modifier = Modifier
                    .weight(1f)
            )
            SummaryCard(
                textId = R.string.cantidad_pendientes,
                value = pendientes,
                modifier = Modifier
                    .weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SummaryCard(
                textId = R.string.cantidad_leidos,
                value = leidos,
                modifier = Modifier
                    .weight(1f)
            )

            AddLibroButton(
                text = stringResource(R.string.anhadir_libro),
                modifier = Modifier
                    .weight(1f)
                    .height(56.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SummaryGridPreview() {
    ProyectoPMDMTheme {
        SummaryGrid(
            leyendo = 2,
            pendientes = 10,
            leidos = 5,
            onAddClick = {})
    }
}

