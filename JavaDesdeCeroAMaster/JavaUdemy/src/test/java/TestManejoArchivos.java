import static ManejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        escribirArchivo("prueba.txt", "Esto es una prueba.");
        anexarArchivo("prueba.txt", "Se anexó este texto.");
        leerArchivo("prueba.txt");
    }
}
