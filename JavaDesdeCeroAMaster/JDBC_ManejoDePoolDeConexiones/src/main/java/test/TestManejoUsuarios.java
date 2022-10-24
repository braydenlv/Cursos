package test;

import datos.Conexion;
import datos.IUsuarioDao;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;

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

            IUsuarioDao usuarioJDBC = new UsuarioDaoJDBC(conexion);

            List<UsuarioDTO> usuarios = usuarioJDBC.seleccionar();
            for (UsuarioDTO usuario : usuarios) {
                System.out.println(usuario);
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
