package EjercicioOnce;

public class Arrays {
    public static void main(String[] args) {

        String [] androidVersions = new String[17]; //La convencion de nombres de los arreglos debe de ser en plural
        String days[] = new String[7];
        String [][] cities = new String[4][2];  //filas/columnas
        int [][][] numbers = new int[2][2][2];  //Cuando se tienen que manejar arreglos de tres o más dimensiones es mejor trabajar con DB
                                                // aunque estas son comunes apra resolver problemas matematicos

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println("Android Versions sin For Each");
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println("\nAndroid versions con For each");
        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }

        cities[0][0]= "Colombia";
        cities[0][1]= "Medellin";
        cities[1][0]= "Colombia";
        cities[1][1]= "Bogota";
        cities[2][0]= "Mexico";
        cities[2][1]= "Guadalajara";
        cities[3][0]= "Mexico";
        cities[3][1]= "CDMX";

        System.out.println("\nCities sin For");
        System.out.println("[" + cities[0][0] + ", " + cities[0][1] + "]");
        System.out.println("[" + cities[1][0] + ", " + cities[1][1] + "]");
        System.out.println("[" + cities[2][0] + ", " + cities[2][1] + "]");
        System.out.println("[" + cities[3][0] + ", " + cities[3][1] + "]");

        System.out.println("\nCities en For");
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < cities[i].length; j++) {
                System.out.print(cities[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
