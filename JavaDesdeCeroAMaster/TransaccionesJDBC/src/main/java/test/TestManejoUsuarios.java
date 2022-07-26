package test;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);

            //Prueba rollback
            //Usuario updateUsuario = new Usuario (2, "xgomez","741811111111111111111111111111111111111111111111111111");

            Usuario updateUsuario = new Usuario (1, "xgomez","7418");
            usuarioJDBC.actualizar(updateUsuario);

            Usuario insertUsuario = new Usuario ("blopera", "6548");
            usuarioJDBC.insertar(insertUsuario);

            conexion.commit();

            List<Usuario> usuarios = usuarioJDBC.seleccionar();
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }

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
