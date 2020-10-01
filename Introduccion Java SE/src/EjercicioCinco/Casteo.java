package EjercicioCinco;

public class Casteo {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //Cuantos perritos ubiqué al mes
        int dogsQuantity=30;
        double monthlyDogs= dogsQuantity/12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 35;
        int b = 12;
        System.out.println(a/b);
        //casteo
        System.out.println((double)a/b);

    }
}
