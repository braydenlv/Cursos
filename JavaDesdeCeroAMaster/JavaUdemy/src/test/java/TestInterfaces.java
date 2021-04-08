import Interfaces.IAccesoDatos;
import Interfaces.ImplementacionMySql;
import Interfaces.ImplementacionOracle;

public class TestInterfaces {

    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        datos.listar();

        datos = new ImplementacionOracle();
        datos.listar();
    }
}
