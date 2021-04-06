package peliculas.datos;

import peliculas.domain.Pelicula;
import peliculas.excepciones.EscrituraDatosEx;
import peliculas.excepciones.LecturaDeDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImplementation implements IAccesoDatos {
    @Override
    public boolean existe(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDeDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
            //System.out.println("Se ha listado todas las peliculas.");
        } catch (FileNotFoundException e) {
            throw new LecturaDeDatosEx("Excepcion al listar peliculas: " + e.getMessage());
        } catch (IOException e) {
            throw new LecturaDeDatosEx("Excepcion al listar peliculas: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha escrito la pelicula " + pelicula.getNombre());
        } catch (IOException e) {
            throw new EscrituraDatosEx("Excepcion al escribir el archivo: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDeDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado = null;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while (linea!=null){
                if (buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
                    break;
                }
                resultado = "Pelicula no encontrada.";
                linea = entrada.readLine();
                indice++;
            }
        } catch (FileNotFoundException e) {
            throw new LecturaDeDatosEx("Excepcion al buscar la pelicula: " + e.getMessage());
        }catch (IOException e) {
            throw new LecturaDeDatosEx("Excepcion al buscar la pelicula: " + e.getMessage());
        }
        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException e) {
            throw new EscrituraDatosEx("Error al crear archivo: " + e.getMessage());
        }

    }

    @Override
    public void borrar(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        if (archivo.exists()){
            archivo.delete();
        }
    }
}
