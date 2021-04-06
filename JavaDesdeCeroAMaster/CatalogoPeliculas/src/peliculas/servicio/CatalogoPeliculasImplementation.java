package peliculas.servicio;

import peliculas.datos.AccesoDatosImplementation;
import peliculas.datos.IAccesoDatos;
import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.LecturaDeDatosEx;

import java.util.List;

public class CatalogoPeliculasImplementation implements ICatalogoPeliculas{

    private final IAccesoDatos datos;

    public CatalogoPeliculasImplementation() {
        this.datos = new AccesoDatosImplementation();
    }

    @Override
    public void agregarPelicula(String nombreDeLaPelicula) {
        Pelicula pelicula = new Pelicula(nombreDeLaPelicula);
        boolean anexar = false;
        try {
            anexar= datos.existe(NOMBRE_ARCHIVO);
            datos.escribir(pelicula,NOMBRE_ARCHIVO,anexar);
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println(accesoDatosEx.getMessage());
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            for (Pelicula pelicula:peliculas) {
                System.out.println(pelicula.getNombre());
            }
        } catch (LecturaDeDatosEx lecturaDeDatosEx) {
            System.out.println(lecturaDeDatosEx.getMessage());
        }
    }

    @Override
    public void buscarPeliculas(String nombreDeLaPelicula) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_ARCHIVO,nombreDeLaPelicula);
            System.out.println(resultado);
        } catch (LecturaDeDatosEx lecturaDeDatosEx) {
            lecturaDeDatosEx.getMessage();
        }

    }

    @Override
    public void iniciarCatalogoDePeliculas() {
        try {
            if(this.datos.existe(NOMBRE_ARCHIVO)){
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            }else {
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println(accesoDatosEx.getMessage());
        }
    }
}
