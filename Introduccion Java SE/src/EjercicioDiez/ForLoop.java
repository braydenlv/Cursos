package EjercicioDiez;

public class ForLoop {
    static boolean isTrunOnLight = false;

    public static void main(String[] args) {
        switchLight();

        for(int i = 1; i <=10; i++){
            printSOS();
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
