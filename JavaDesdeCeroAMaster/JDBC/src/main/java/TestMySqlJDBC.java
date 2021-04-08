import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&publicKeyRetrieval=true"; //String de coneccion se debe de buscar cuando se quiere conectar a un DB

        try {
            //Class.forName("org.braydenlv.Driver"); //Solo es requerido para aplicaciones web
            Connection conexion = DriverManager.getConnection(url,"root", "admin");
            Statement instruccion = conexion.createStatement(); //Nos permite ejecutar instrucciones a la DB
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona"; //sentencia
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("id_persona: "+resultado.getInt("id_persona"));
                System.out.print(", nombre: "+resultado.getString("nombre"));
                System.out.print(", apellido: "+resultado.getString("apellido"));
                System.out.print(", email: "+resultado.getString("email"));
                System.out.println(", telefono: "+resultado.getString("telefono"));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
