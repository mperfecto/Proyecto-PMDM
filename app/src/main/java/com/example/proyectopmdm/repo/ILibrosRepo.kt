package com.example.proyectopmdm.repo

import com.example.spotifyhome.model.Libro

interface ILibrosRepo {

    fun addLibro(libro: Libro): Libro
    fun getLibros(): List<Libro>

}