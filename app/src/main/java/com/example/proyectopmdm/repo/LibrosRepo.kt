package com.example.proyectopmdm.repo

import com.example.proyectopmdm.R
import com.example.spotifyhome.model.Libro
import java.util.Date


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
                isbn = "978-84-233-5126-0",
                titulo = "Los renglones torcidos de Dios",
                autor = "Torcuato Luca de Tena",
                sinopsis = "Una novela emocionante, un testimonio único, un libro para siempre.\n" +
                        "Alice Gould es ingresada en un sanatorio mental. En su delirio, cree ser " +
                        "una investigadora privada a cargo de un equipo de detectives dedicados a " +
                        "esclarecer complicados casos. Según una carta de su médico particular, la " +
                        "realidad es otra: su paranoica obsesión es atentar contra la vida de su marido. " +
                        "La extrema inteligencia de esta mujer y su actitud aparentemente normal " +
                        "confundirán a los médicos hasta el punto de no saber a ciencia cierta si " +
                        "Alice ha sido ingresada injustamente o en realidad padece un grave y " +
                        "peligroso trastorno psicológico.",
                fechaPublicacion = Date(1979 - 1900, 0, 1),
                paginasTotales = 512,
                paginasLeidas = 250,
                ultimaLectura = Date(2025 - 1900, 9, 25),
                portada = R.drawable.los_renglones_torcidos_de_dios
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-322-3999-4",
                titulo = "La larga marcha",
                autor = "Stephen King",
                sinopsis = "Una inquietante novela futurista donde la realidad supera a la fantasía " +
                        "más terrorífica. El escenario: una sociedad ultraconservadora que ha llevado " +
                        "al paroxismo sus rasgos más perversos, dominada por un estado policial. " +
                        "El acontecimiento: la más extraordinaria competición deportiva, una agotadora " +
                        "marcha a pie donde un traspié puede ser el último. Los competidores: cien " +
                        "adolescentes elegidos a sorteo y decididos a pasar sobre los cadáveres de " +
                        "sus compañeros para llegar a la meta. El premio: fama y fortuna para el ganador, " +
                        "es decir, para el único superviviente...\n" +
                        "Solo uno será el triunfador.\n" +
                        "Los 99 restantes morirán.",
                fechaPublicacion = Date(1978 - 1900, 11, 1),
                paginasTotales = 352,
                paginasLeidas = 0,
                ultimaLectura = null,
                portada = R.drawable.la_larga_marcha
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-233-6243-3",
                titulo = "La mala costumbre",
                autor = "Alana S. Portero",
                sinopsis = "Narrada desde una singular y desgarradora voz en primera persona, " +
                        "La mala costumbre recorre la adolescencia de una niña atrapada en un cuerpo " +
                        "que no sabe habitar, que intenta comprenderse a sí misma y al mundo en el que " +
                        "vive, desde su infancia en una familia de clase obrera en el barrio de San " +
                        "Blas, arrasado por la heroína en los años ochenta, hasta las noches clandestinas " +
                        "en el centro de Madrid de los noventa. Como en una versión bastarda del viaje " +
                        "del héroe, yonquis, divas pop y ángeles caídos la acompañan en un viaje vital " +
                        "en el que, al final, serán otras mujeres quienes le ayuden a superar la violencia " +
                        "que encuentra a cada paso.",
                fechaPublicacion = Date(2023 - 1900, 4, 3),
                paginasTotales = 252,
                paginasLeidas = 0,
                ultimaLectura = null,
                portada = R.drawable.la_mala_costumbre
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-666-5797-6",
                titulo = "El silencio de la ciudad blanca",
                autor = "Eva García Sáenz de Urturi",
                sinopsis = "Veinte años después, cuando Tasio, el brillante arqueólogo condenado por " +
                        "los asesinatos está a punto de salir de prisión en su primer permiso, los " +
                        "crímenes se reanudan de nuevo: una pareja de veinte años aparece muerta y " +
                        "desnuda por la picadura de abejas en la garganta en la emblemática Catedral " +
                        "Vieja de Vitoria. Poco después, otra pareja de veinticinco años es asesinada " +
                        "en la Casa del Cordón, un edificio medieval.\n" +
                        "\n" +
                        "El joven inspector Unai López de Ayala —alias Kraken—, experto en perfiles " +
                        "criminales, está obsesionado con prevenir los crímenes antes de que ocurran, " +
                        "una tragedia personal aún fresca no le permite encarar el caso como uno más. " +
                        "Sus métodos poco ortodoxos enervan a su jefa, Alba, la subcomisaria con la que " +
                        "mantiene una relación laboral difícil de día, y una intensa atracción y " +
                        "fascinación de madrugada, cada vez que ambos coinciden haciendo running por " +
                        "las solitarias calles de Vitoria.\n" +
                        "\n" +
                        "Una novela negra absorbente que se mueve entre la mitología y las leyendas " +
                        "de Álava, la arqueología, los secretos de familia y la psicología criminal. " +
                        "Un noir elegante y complejo que demuestra cómo los errores del pasado pueden " +
                        "influir en el presente.",
                fechaPublicacion = Date(2016 - 1900, 3, 12),
                paginasTotales = 482,
                paginasLeidas = 0,
                ultimaLectura = null,
                portada = R.drawable.el_silencio_de_la_ciudad_blanca
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-84-8018-401-4",
                titulo = "Todos los azules",
                autor = "Santi Maldonado",
                sinopsis = "Aimar es un joven con autismo que busca su lugar en el mundo: el lenguaje " +
                        "verbal es algo extraño para él, un código indescifrable con unas reglas " +
                        "propias que escapan a su entendimiento; Jon acaba de entrar en la cuarentena, " +
                        "vuelve a su ciudad tras haber pasado varios años en el extranjero, se " +
                        "reencuentra con Ane, la madre de Aimar, un amor de juventud, y estas tres " +
                        "vidas empiezan a cruzar sus presentes y... sus pasados. Todos los azules " +
                        "llevará al lector hasta el rico mundo interior de Aimar, sus formas de pensar " +
                        "y de sentir, las limitaciones de su trastorno y su capacidad de superación. " +
                        "Pero no solo constituye una reivindicación del derecho a ser diferente, sino " +
                        "que, además, como todas las buenas novelas, pondrá al lector en contacto con " +
                        "la esencia de la naturaleza humana.",
                fechaPublicacion = Date(2016 - 1900, 1, 26),
                paginasTotales = 146,
                paginasLeidas = 0,
                ultimaLectura = null,
                portada = R.drawable.todos_los_azules
            )
        )

        librosMock.add(
            Libro(
                id = nextId++,
                isbn = "978-8419456670",
                titulo = "Cómo sobrevivir a tu propio asesinato",
                autor = "Kristen Perrin",
                sinopsis = "Corre 1965, y la adolescente Frances Adams está en una feria rural inglesa " +
                        "en la que una adivina hace una prediccion un día, será asesinada. Frances se " +
                        "pasa la vida intentando resolver un crimen que aún no se ha producido y, " +
                        "durante décadas, nadie la toma en serio, hasta que, casi sesenta años después, " +
                        "aparece asesinada.\n" +
                        "\n" +
                        "En el presente, Annie Adams ha sido convocada a una reunión en la extensa " +
                        "finca de su rica y recluida tía abuela Frances. Pero cuando Annie llega, " +
                        "Frances ya está muerta. Annie está decidida a atrapar al asesino. Y, a medida " +
                        "que Annie se acerca a la verdad, empieza a temer heredar el destino de su " +
                        "tía en lugar de su fortuna.",
                fechaPublicacion = Date(2024 - 1900, 2, 26),
                paginasTotales = 405,
                paginasLeidas = 0,
                ultimaLectura = null,
                portada = R.drawable.como_sobrevivir_a_tu_propio_asesinato
            )
        )
    }
}