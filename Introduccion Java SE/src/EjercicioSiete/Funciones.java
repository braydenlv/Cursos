package EjercicioSiete;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("De COP a USD:" + convertToDolar(3850,"COP"));
        System.out.println("De MXN a USD:" + convertToDolar(4000,"MXN"));
    }

    /**
     * Descripción: Función que especificando la moneda convierte dicha moneda en dolar
     *
     * @param quantity Cantidad de dinero a convertir
     * @param currency Origen de la moneda o tipo de moneda, solo acepta COP o MXN
     * @return quantity Devuelve la cantidad actualizada a dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        switch (currency){
            case "COP":
                quantity=quantity*0.00026;
                break;
            case "MXN":
                quantity=quantity*0.045;
                break;
            default:
                quantity=0;
                System.out.println("Tipo de moneda no encontrada");
        }
        return quantity;
    }
}
