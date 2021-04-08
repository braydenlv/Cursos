import Excepciones.Aritmetica.Aritmetica;
import Excepciones.Operacion.OperacionCheckExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado =0;

        try{
            resultado = Aritmetica.divisionCheck(10,0);
        }
        catch (OperacionCheckExcepcion e){
            System.out.println("ocurrió un error tipo OperacionCheckExcepcion: ");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("No es posible realizar la operación: ");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("se revisó la division por cero.");
        }

        System.out.println("Resultado check: " + resultado);

        resultado = Aritmetica.divisonUncheck(10,0);
        System.out.println("Resultado uncheck: " + resultado);
    }
}
