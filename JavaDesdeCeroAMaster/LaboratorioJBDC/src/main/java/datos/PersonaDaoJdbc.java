package datos;

import domain.PersonaDTO;
import domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoJdbc implements PersonaDAO{
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona";
    private static final String SQL_INSERT = "INSERT INTO test.persona (nombre, apellido, email, telefono) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE test.usuario SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM test.persona WHERE id_persona = ?";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario user = null;

        List<Usuario> personas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                personas.add(new Usuario(idUsuario, usuario, password));
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

    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, usuario.getUsuario()); //el parameterIndex es para indicar cual ? va a cambiar en el String del INSERT
            ps.setString(2, usuario.getPassword());
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

    public int actualizar(Usuario usuario){
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getIdUsuario());
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

    public int eliminar (Usuario usuario){
        Connection conn =null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            ps= conn.prepareCall(SQL_DELETE);
            ps.setInt(1, usuario.getIdUsuario());
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

    @Override
    public List<PersonaDTO> select() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario user = null;

        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();

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
                personas.add(new PersonaDTO(idPersona, nombre, apellido, email, telefono));
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

    @Override
    public int insert(PersonaDTO persona) {
        return 0;
    }

    @Override
    public int update(PersonaDTO persona) {
        return 0;
    }

    @Override
    public int delete(PersonaDTO persona) {
        return 0;
    }
}
