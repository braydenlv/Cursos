package ManejoArchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo (String nombreArchivo){
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void escribirArchivo (String nombreArchivo, String contenido){
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void anexarArchivo (String nombreArchivo, String contenidoAnexar){
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenidoAnexar);
            salida.close();
            System.out.println("Se ha anexado texto al archivo");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void leerArchivo (String nombreArchivo){
        try {
            File archivo = new File(nombreArchivo);
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            System.out.println("::CONTENIDO DEL ARCHIVO::");
            do{
                lectura = entrada.readLine();
                if (lectura != null ){System.out.println(lectura);}
            }while(lectura != null);
            entrada.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
