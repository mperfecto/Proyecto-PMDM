package com.example.proyectopmdm.repo

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.spotifyhome.model.Libro
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
class LibrosRepo : ILibrosRepo {

    val librosMock = ArrayList<Libro>()
    var nextId = 1

    override fun addLibro(libro: Libro): Libro {
        val libroConId = if (libro.id == 0) libro.copy(id = nextId++) else libro
        librosMock.add(libroConId)
        return libroConId
    }

    override fun getLibros(): List<Libro> {
        return librosMock
    }

    init {
        librosMock.add(
            Libro(
                id = nextId++,
                titulo = "El principito",
                autor = "Antoine de Saint-Exupéry",
                sinopsis = "El principito es una novela corta y la obra maestra de la literatura francesa. ...",
                paginasTotales = 100,
                paginasLeidas = 50,
                ultimaLectura = LocalDate.of(2025, 10, 24)
            )
        )
    }

}