package com.example.proyectopmdm.myComponents

import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm.ui.theme.ProyectoPMDMTheme

@Composable
fun ClickableLabel(
    text: String,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        lineHeight = 16.sp,
        style = MaterialTheme.typography.titleMedium.copy(
            fontSize = 16.sp,
        ),
        textDecoration = TextDecoration.Underline,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        modifier = modifier
            .clickable { onClick() }
    )
}


@Preview(showBackground = true)
@Composable
fun ClickableLabelPreview() {
    ProyectoPMDMTheme {
        ClickableLabel(text = "email")
    }
}
