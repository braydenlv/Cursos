package peliculas.presentacion;

import peliculas.servicio.CatalogoPeliculasImplementation;
import peliculas.servicio.ICatalogoPeliculas;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        int opcion = -1;
        Scanner escaner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImplementation();

        while (opcion!=0){
            try {
                System.out.println("Elige una opcion: \n" +
                        "\t1. Iniciar catalogo de peliculas.\n" +
                        "\t2. Agregar pelicula.\n" +
                        "\t3. Listar peliculas.\n" +
                        "\t4. Buscar peliculas.\n" +
                        "\t0. Salir.");
                opcion=Integer.parseInt(escaner.nextLine());

                switch (opcion){
                    case 1:
                        catalogo.iniciarCatalogoDePeliculas();
                        break;
                    case 2:
                        System.out.println("Por favor introduce el nombre de la pelicula.");
                        String nombrePeliculaACrear = escaner.nextLine();
                        catalogo.agregarPelicula(nombrePeliculaACrear);
                        break;
                    case 3:
                        catalogo.listarPeliculas();
                        break;
                    case 4:
                        System.out.println("Por favor ingrese el nombre de la pelicula a buscar.");
                        String nombrePeliculaABuscar = escaner.nextLine();
                        catalogo.buscarPeliculas(nombrePeliculaABuscar);
                        break;
                    case 0:
                        System.out.println("Hasta luego.");
                        break;
                    default:
                        System.out.println("Opcion no reconocida.");
                        break;
                }
            }catch (Exception e){
                System.out.println("Ha ocurrido un en error al momento de leer la opción. Asegurese de usar solo numeros.");
            }

        }
        return;
    }
}
