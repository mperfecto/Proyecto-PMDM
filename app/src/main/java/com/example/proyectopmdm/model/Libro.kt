package com.example.spotifyhome.model

import com.example.proyectopmdm.R
import java.util.Date

data class Libro(
    val id: Int,
    val isbn: String,
    val titulo: String,
    val autor: String,
    val portada: Int = R.drawable.book,
    val sinopsis: String,
    val fechaPublicacion: Date,
    val paginasTotales: Int,
    val paginasLeidas: Int? = null,
    val ultimaLectura: Date? = null
)