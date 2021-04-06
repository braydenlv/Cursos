package peliculas.datos;

import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.EscrituraDatosEx;
import peliculas.excepciones.LecturaDeDatosEx;

import java.util.List;

public interface IAccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDeDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDeDatosEx;

    void crear(String nombreArchivo) throws EscrituraDatosEx;

    void borrar(String nombreArchivo) throws EscrituraDatosEx;
}
