package test;

import datos.Conexion;
import datos.IPersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;

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

            IPersonaDao personaDao = new PersonaDaoJDBC(conexion);

            List<PersonaDTO> personas = personaDao.seleccionar();
            for (PersonaDTO persona : personas) {
                System.out.println(persona);
            }

            conexion.commit();

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            try {
                System.out.println("Ocurrio un error, se realiza rollback de los querys.");
                conexion.rollback();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

    }
}
