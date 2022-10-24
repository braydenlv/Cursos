package datos;

import domain.UsuarioDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoJDBC implements IUsuarioDao {

    private Connection conexion;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM test.usuario";
    private static final String SQL_INSERT = "INSERT INTO test.usuario (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE test.usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM test.usuario WHERE id_usuario = ?";

    public UsuarioDaoJDBC() {
    }

    public UsuarioDaoJDBC(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<UsuarioDTO> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        UsuarioDTO user = null;

        List<UsuarioDTO> personas = new ArrayList<UsuarioDTO>();

        try {
            conn = this.conexion != null ? this.conexion : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                personas.add(new UsuarioDTO(idUsuario, usuario, password));
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

    @Override
    public int insertar(UsuarioDTO usuario)  throws SQLException{
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

    @Override
    public int actualizar(UsuarioDTO usuario)  throws SQLException {
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

    @Override
    public int eliminar(UsuarioDTO usuario) throws SQLException{
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
