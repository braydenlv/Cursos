package Excepciones.Operacion;

public class OperacionUncheckExcepcion extends RuntimeException{
    public OperacionUncheckExcepcion (String mensaje){
        super(mensaje);
    }
}
