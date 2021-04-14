package test;

import datos.UsuarioDAO;
import domain.Usuario;

import java.util.List;

public class TestLaboratorio {
    public static void main(String[] args){
        UsuarioDAO usuarioDAO = new UsuarioDAO();


        System.out.println("============================INSERT============================");
        //Insertando un nuevo objeto de tipo Persona
        Usuario usuario = new Usuario("prueba3","8523");
        usuarioDAO.insertar(usuario);
        imprimirTabla(usuarioDAO);




        System.out.println("============================UPDATE============================");
        //Se cambian los valores para la prueba
        usuario.setIdUsuario(3);
        usuario.setPassword("3258");
        //se ejecuta
        usuarioDAO.actualizar(usuario);
        imprimirTabla(usuarioDAO);


        System.out.println("============================DELETE============================");
        usuarioDAO.eliminar(usuario);
        imprimirTabla(usuarioDAO);


    }

    public static void imprimirTabla(UsuarioDAO usuarioDAO){
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

}
