package datos;

import domain.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona";
    private static final String SQL_INSERT = "INSERT INTO test.persona (nombre, apellido, email, telefono) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE test.persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM test.persona WHERE id_persona = ?";

    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Persona persona = null;

        List<Persona> personas = new ArrayList<Persona>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                personas.add(new Persona(idPersona, nombre, apellido, email, telefono));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, persona.getNombre()); //el parameterIndex es para indicar cual ? va a cambiar en el String del INSERT
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());
            registros = ps.executeUpdate(); //puede ejecutar INSERT, DELETE o UPDATE
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Persona persona){
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());
            ps.setInt(5, persona.getIdPersona());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar (Persona persona){
        Connection conn =null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            ps= conn.prepareCall(SQL_DELETE);
            ps.setInt(1, persona.getIdPersona());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }

}
