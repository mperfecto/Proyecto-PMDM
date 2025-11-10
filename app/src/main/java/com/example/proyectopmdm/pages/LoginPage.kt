package com.example.proyectopmdm.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm.R
import com.example.proyectopmdm.myComponents.ClickableLabel
import com.example.proyectopmdm.myComponents.FieldCard
import com.example.proyectopmdm.myComponents.FieldLabel
import com.example.proyectopmdm.myComponents.MainButton
import com.example.proyectopmdm.myComponents.TitleHeader
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun LoginPage(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleHeader(
            text = stringResource(R.string.inicio_sesion),
            modifier = Modifier
                .padding(bottom = 15.dp)
        )

        FieldLabel(
            text = stringResource(R.string.email),
            modifier = Modifier
                .padding(top = 10.dp, start = 2.dp, bottom = 2.dp)
                .align(Alignment.Start)

        )
        FieldCard(
            placeholder = stringResource(R.string.introduce_email),
            modifier = Modifier
                .padding(bottom = 10.dp)
        )

        FieldLabel(
            text = stringResource(R.string.contrasenha),
            modifier = Modifier
                .padding(top = 10.dp, start = 2.dp, bottom = 2.dp)
                .align(Alignment.Start)
        )
        FieldCard(
            placeholder = stringResource(R.string.introduce_contrasenha)
        )

        ClickableLabel(
            text = stringResource(R.string.contrasenha_olvidada),
            modifier = Modifier
                .padding(top = 2.dp, bottom = 10.dp, end = 2.dp)
                .align(Alignment.End)
        )

        MainButton(
            text = stringResource(R.string.iniciar_sesion),
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            ),
            modifier = Modifier
                .padding(top = 10.dp, bottom = 2.dp)
        )
        ClickableLabel(
            text = stringResource(R.string.registrate),

        )
    }
}


@Preview
@Composable
fun LoginPagePreview() {
    ProyectoPMDMTheme {
        Scaffold(
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        { innerPadding ->
            LoginPage(innerPadding)
        }
    }
}