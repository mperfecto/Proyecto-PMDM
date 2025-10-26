package com.example.proyectopmdm.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = DarkWarmPeach,
    onPrimary = DarkRichMahogany,
    primaryContainer = DarkRustContainer,
    onPrimaryContainer = DarkPaleCoral,

    secondary = DarkSoftRose,
    onSecondary = DarkDeepCocoa,
    secondaryContainer = DarkWalnutContainer,
    onSecondaryContainer = DarkPaleClay,

    tertiary = DarkMutedGold,
    onTertiary = DarkOliveBrown,
    tertiaryContainer = DarkEarthContainer,
    onTertiaryContainer = DarkGoldenSand,

    surfaceDim = DarkMochaDim,
    surface = DarkMochaSurface,
    surfaceBright = DarkMochaBright,
    surfaceContainerLowest = DarkCoffeeLowest,
    surfaceContainerLow = DarkCoffeeLow,
    surfaceContainer = DarkCoffee,
    surfaceContainerHigh = DarkCoffeeHigh,
    surfaceContainerHighest = DarkCoffeeHighest,

    onSurface = DarkIvoryText,
    onSurfaceVariant = DarkRoseBeigeText,
    outline = DarkAshOutline,
    outlineVariant = DarkClayOutline,

    inverseSurface = DarkIvoryInverseSurface,
    inverseOnSurface = DarkEspressoInverseText,
    inversePrimary = DarkBrickAccent,

    error = DarkSoftRedError,
    onError = DarkWineRedErrorText,
    errorContainer = DarkDeepCrimsonErrorContainer,
    onErrorContainer = DarkPaleRoseErrorText,
)

private val LightColorScheme = lightColorScheme(
    primary = WarmGold,
    onPrimary = PureWhite,
    primaryContainer = LightGold,
    onPrimaryContainer = DarkGold,

    secondary = SoftBrown,
    onSecondary = PureWhite,
    secondaryContainer = LightBrown,
    onSecondaryContainer = DarkBrown,

    tertiary = OliveGreen,
    onTertiary = PureWhite,
    tertiaryContainer = LightOlive,
    onTertiaryContainer = DarkOlive,

    background = CreamSurface,
    surface = CreamSurface,
    surfaceDim = BeigeSurfaceDim,
    surfaceBright = CreamSurfaceBright,
    surfaceContainerLowest = LightBeigeLow,
    surfaceContainerLow = LightBeigeLow,
    surfaceContainer = LightBeige,
    surfaceContainerHigh = MediumBeige,
    surfaceContainerHighest = DarkBeige,

    onSurface = DeepBrownText,
    onSurfaceVariant = TaupeTextVariant,

    outline = TaupeOutline,
    outlineVariant = LightTaupeOutline,

    inverseSurface = DarkSurface,
    inverseOnSurface = LightOnDarkText,
    inversePrimary = PaleGold,

    error = BrightCrimsonError,
    onError = PureWhiteOnError,
    errorContainer = SoftRoseErrorContainer,
    onErrorContainer = DeepCrimsonOnErrorContainer
)

@Composable
fun ProyectoPMDMTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}