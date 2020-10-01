package EjercicioTres;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono 200
        salary = salary+200;

        //pension $50 de descuento
        salary = salary - 50;

        //horas extras $30 c/u
        salary = salary + (30*2);

        //Comida $45 descuento
        salary = salary - 45;

        System.out.println("el salario fue: "+salary);

        //Actualizando cadenas de texto
        String employeeName = "Brayden";
        employeeName = employeeName + " Lopera";
        employeeName = "Sr. " + employeeName;
        System.out.println("Nombre completo del empleado " +employeeName);

    }
}
