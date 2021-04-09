package datos;

import domain.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona";
    private static final String SQL_INSERT = "INSERT INTO test.persona (nombre, apellido, email, telefono) VALUES (?,?,?,?)";

    public List<Persona> seleccionar() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Persona persona = null;

        List<Persona> personas = new ArrayList<Persona>();

        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");
                personas.add(new Persona(idPersona, nombre, apellido, email, telefono));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(resultSet);
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, persona.getNombre()); //el parameterIndex es para indicar cual ? va a cambiar en el String del INSERT
            preparedStatement.setString(2, persona.getApellido());
            preparedStatement.setString(3, persona.getEmail());
            preparedStatement.setString(4, persona.getTelefono());
            registros = preparedStatement.executeUpdate(); //puede ejecutar INSERT, DELETE o UPDATE
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
