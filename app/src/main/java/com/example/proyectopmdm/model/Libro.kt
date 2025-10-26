package com.example.spotifyhome.model

import com.example.proyectopmdm.R
import java.time.LocalDate

data class Libro(
    val id: Int,
    val titulo: String,
    val autor: String,
    val portada: Int = R.drawable.book,
    val sinopsis: String,
    val paginasTotales: Int,
    val paginasLeidas: Int? = null,
    val ultimaLectura: LocalDate? = null
)