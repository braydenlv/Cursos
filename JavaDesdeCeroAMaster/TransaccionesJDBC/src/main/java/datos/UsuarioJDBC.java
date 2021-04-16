package datos;

import domain.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioJDBC {

    private Connection conexion;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM test.usuario";
    private static final String SQL_INSERT = "INSERT INTO test.usuario (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE test.usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM test.usuario WHERE id_usuario = ?";

    public UsuarioJDBC() {
    }

    public UsuarioJDBC(Connection conexion) {
        this.conexion = conexion;
    }

    public List<Usuario> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario user = null;

        List<Usuario> personas = new ArrayList<Usuario>();

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                personas.add(new Usuario(idUsuario, usuario, password));
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                if (this.conexion == null){
                    Conexion.close(conn);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Usuario usuario)  throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, usuario.getUsuario()); //el parameterIndex es para indicar cual ? va a cambiar en el String del INSERT
            ps.setString(2, usuario.getPassword());
            registros = ps.executeUpdate(); //puede ejecutar INSERT, DELETE o UPDATE
        } finally {
            try {
                Conexion.close(ps);
                if (this.conexion == null){
                    Conexion.close(conn);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario)  throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getIdUsuario());
            ps.executeUpdate();
        } finally {
            try {
                Conexion.close(ps);
                if (this.conexion == null){
                    Conexion.close(conn);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Usuario usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            ps = conn.prepareCall(SQL_DELETE);
            ps.setInt(1, usuario.getIdUsuario());
            ps.executeUpdate();
        } finally {
            try {
                Conexion.close(ps);
                if (this.conexion == null){
                    Conexion.close(conn);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
