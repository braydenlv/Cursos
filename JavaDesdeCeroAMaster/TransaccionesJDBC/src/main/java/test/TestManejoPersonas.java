package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;

import java.sql.*;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);

            Persona updatePersona = new Persona(5, "Camilo", "Jaramillo", "cjaramillo@correo.com", "6547898");
            personaJDBC.actualizar(updatePersona);

            //Prueba rollback
            //Persona personaInsert = new Persona("Luisa", "Zapata1234567890123456789012345678901234567890123456789", "lzapata@correo.com","3256987");
            Persona personaInsert = new Persona("Luisa", "Zapata", "lzapata@correo.com", "3256987");
            personaJDBC.insertar(personaInsert);

            conexion.commit();

            List<Persona> personas = personaJDBC.seleccionar();
            for (Persona persona : personas) {
                System.out.println(persona);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            try {
                conexion.rollback();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

    }
}
