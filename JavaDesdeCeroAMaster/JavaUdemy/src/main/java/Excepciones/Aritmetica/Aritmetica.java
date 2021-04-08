package Excepciones.Aritmetica;

import Excepciones.Operacion.OperacionCheckExcepcion;
import Excepciones.Operacion.OperacionUncheckExcepcion;

public class Aritmetica {
    public static int divisionCheck(int numerador, int denominador) throws OperacionCheckExcepcion {
        if (denominador==0)
        {
            throw new OperacionCheckExcepcion("Division entre cero.");
        }

        return numerador/denominador;

    }

    public static int divisonUncheck(int numerador, int denominador){
        if (denominador==0){
            throw new OperacionUncheckExcepcion("Division por cero.");
        }

        return numerador/denominador;
    }
}
