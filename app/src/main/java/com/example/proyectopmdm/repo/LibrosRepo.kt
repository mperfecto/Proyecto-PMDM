package com.example.proyectopmdm.repo

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.proyectopmdm.R
import com.example.spotifyhome.model.Libro
import java.util.Date

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
                isbn = "978-84-376-0494-7",
                titulo = "El Principito",
                autor = "Antoine de Saint-Exupéry",
                sinopsis = "‘El Principito’ es una fábula poética sobre la inocencia, la amistad y el sentido de la vida. A través del encuentro entre un piloto perdido en el desierto y un misterioso niño proveniente de otro planeta, la historia explora temas como la soledad, el amor y la pérdida. Con un lenguaje sencillo pero profundamente simbólico, Saint-Exupéry invita al lector a redescubrir la mirada pura y curiosa de la infancia, recordándonos que “lo esencial es invisible a los ojos”.",
                fechaPublicacion = Date(1943 - 1900, 3, 6),
                paginasTotales = 96,
                paginasLeidas = 50,
                ultimaLectura = Date(2025 - 1900, 9, 24),
                portada = R.drawable.book
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-0-452-28423-4",
                titulo = "1984",
                autor = "George Orwell",
                sinopsis = "‘1984’ es una de las novelas más influyentes del siglo XX. En un futuro distópico, el mundo está gobernado por un régimen totalitario que controla cada aspecto de la vida de los ciudadanos. Winston Smith, un hombre corriente, comienza a cuestionar el poder del Gran Hermano y la manipulación de la verdad. Con una prosa clara y perturbadora, Orwell construye una advertencia eterna sobre los peligros del autoritarismo, la censura y la pérdida de la libertad individual.",
                fechaPublicacion = Date(1949 - 1900, 5, 8),
                paginasTotales = 328,
                paginasLeidas = 100,
                ultimaLectura = Date(2025 - 1900, 5, 12),
                portada = R.drawable.book
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-376-0494-8",
                titulo = "Cien años de soledad",
                autor = "Gabriel García Márquez",
                sinopsis = "Considerada una de las obras maestras de la literatura universal, ‘Cien años de soledad’ narra la historia de la familia Buendía a lo largo de varias generaciones en el mítico pueblo de Macondo. A través de su prosa rica y desbordante, García Márquez mezcla lo real con lo fantástico, creando un universo propio donde el tiempo, la memoria y el destino se entrelazan. Es una reflexión sobre la soledad humana, la historia de Latinoamérica y la naturaleza cíclica de la vida.",
                fechaPublicacion = Date(1967 - 1900, 5, 30),
                paginasTotales = 471,
                paginasLeidas = 150,
                ultimaLectura = Date(2025 - 1900, 3, 8),
                portada = R.drawable.book
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-08-03630-7",
                titulo = "La sombra del viento",
                autor = "Carlos Ruiz Zafón",
                sinopsis = "En la Barcelona de posguerra, Daniel Sempere descubre un misterioso libro titulado ‘La sombra del viento’ en el Cementerio de los Libros Olvidados. Fascinado por su autor, Julián Carax, Daniel se embarca en una búsqueda que lo llevará a descubrir secretos ocultos, amores imposibles y tragedias del pasado. Con una mezcla de intriga, romanticismo y melancolía, Zafón crea una novela inolvidable sobre el poder de las palabras y la memoria.",
                fechaPublicacion = Date(2001 - 1900, 4, 17),
                paginasTotales = 576,
                paginasLeidas = 200,
                ultimaLectura = Date(2025 - 1900, 7, 15),
                portada = R.drawable.book
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-376-0494-9",
                titulo = "Don Quijote de la Mancha",
                autor = "Miguel de Cervantes Saavedra",
                sinopsis = "Publicada a comienzos del siglo XVII, ‘Don Quijote de la Mancha’ relata las aventuras del ingenioso hidalgo Alonso Quijano, quien, obsesionado por las historias de caballería, decide convertirse en caballero andante bajo el nombre de Don Quijote. Acompañado por su fiel escudero Sancho Panza, emprende una serie de aventuras tan absurdas como conmovedoras. Cervantes combina humor, crítica social y una profunda reflexión sobre la locura, los sueños y la realidad.",
                fechaPublicacion = Date(1605 - 1900, 0, 16),
                paginasTotales = 863,
                paginasLeidas = 500,
                ultimaLectura = Date(2025 - 1900, 4, 1),
                portada = R.drawable.book
            )
        )
    }
}