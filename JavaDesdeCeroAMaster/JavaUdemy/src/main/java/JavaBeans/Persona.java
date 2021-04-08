package JavaBeans;

import java.io.Serializable;

public class Persona implements Serializable {

    //Para que una clase sea Serializable y poder ser enviada a través de distintos servidores JAVA
    //debe de tener todas sus variables privadas con sus respectivos Getters y Setters y tener un constructor vacío

    private String nombre;
    private String apellido;

    public Persona (){

    }

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
