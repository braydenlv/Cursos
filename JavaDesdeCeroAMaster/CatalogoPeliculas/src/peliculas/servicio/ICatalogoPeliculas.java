package peliculas.servicio;

public interface ICatalogoPeliculas {

    String NOMBRE_ARCHIVO = "Peliculas.txt";

    void agregarPelicula(String nombreDeLaPelicula);
    void listarPeliculas();
    void buscarPeliculas(String nombreDeLaPelicula);
    void iniciarCatalogoDePeliculas();
}
