package Interfaces;

public interface IAccesoDatos {
    //Las interfaces se utiliza cuando hay comportamientos similares entre clases
    //las clases abstractas se utiliza cuando tiene caracteristicas en común

    int MAX_REGISTROS = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
