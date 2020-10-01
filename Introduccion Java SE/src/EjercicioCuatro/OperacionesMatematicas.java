package EjercicioCuatro;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        double x=2.1;
        double y=3;

        //redondea siempre por arriba
        System.out.println("ceil: "+Math.ceil(x));

        //redondea siempre por debajo
        System.out.println("floor: "+Math.floor(x));

        //Devuelve un numero elevado a otro numero (numero, potencia)
        System.out.println("pow: "+Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println("max: "+Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println("sqrt: "+Math.sqrt(y));

        //Area de un circulo
        //Pi*r^2
        System.out.println("Area circulo: "+(Math.PI * Math.pow(y,2)));

        //Area de una esfera
        //4*Pi*r^2
        System.out.println("Area esfera: "+(4*Math.PI*Math.pow(y,2)));

        //Volumen de una esfera
        //4/3*Pi*r^3
        System.out.println("volumen esfera: "+((4/3)*Math.PI*Math.pow(y,3)));

    }
}
