package EjercicioNueve;

public class WhileLoop {

    static boolean isTrunOnLight = false;

    public static void main(String[] args) {
        int i=1;
        switchLight();

        while(isTrunOnLight && i <=10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean switchLight(){
        isTrunOnLight = (isTrunOnLight)?false:true; //esto es lo mismo que hay abajo comentado
        /*
        if(isTrunOnLight){
            isTrunOnLight=false;
        }else {
            isTrunOnLight=true;
        }
        */
        return isTrunOnLight;
    }
}
