import java.sql.SQLOutput;
import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        //La lista se pueden duplicar elementos
        //La lista tiene orden de elementos
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Domingo");

        System.out.println("\nLIST\n");
        imprimir(miLista);

        //El set es mas rapido en el manejo de elementos
        //El set no tiene orden de elementos
        Set<String> miSet = new HashSet<>();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sábado");
        miSet.add("Domingo");
        miSet.add("Domingo");

        System.out.println("\nSET\n");
        imprimir(miSet);

        Map<Integer,String> miMap = new HashMap<>();
        miMap.put(1, "Lunes");
        miMap.put(2, "Martes");
        miMap.put(3, "Miercoles");
        miMap.put(4, "Jueves");
        miMap.put(5, "Viernes");
        miMap.put(6, "Sábado");
        miMap.put(7, "Domingo");

        System.out.println("\nMAP\n");
        String elemento = miMap.get(1);
        System.out.println(elemento);
        System.out.println("Set keys del Map:::::::::::::::::::::::");
        //imprimir( miMap.keySet()); //keySet devuelve un Set
        System.out.println("Set values del Map:::::::::::::::::::::::");
        imprimir(miMap.values()); //keySet devuelve un collection


    }

    public static void imprimir (Collection<String> coleccion){
        System.out.println("Normal:::::::::::::::::");
        //foreach normal
        for (String elemento:coleccion) {
            System.out.println(elemento);
        }

        System.out.println("Flecha:::::::::::::::::");
        //Funcion lamda o flecha
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
