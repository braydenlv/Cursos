package EjercicioSeis;

public class SentenciaIf {
    public static void main(String[] args) {
        boolean isBluetoothEnabled= true;
        int fileSended=3;

        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("Archivo enviado");
        }else {
            System.out.println("Por favor enciende el bluetooth");
        }
    }

}
