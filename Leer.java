import java.io.BufferedReader;
import java.io.IOException;

public class Leer {
    private final static BufferedReader entradaConsola =
            new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static  String leerTexto(String mensaje) {
        String respuesta = null;
        do{
            try{
                System.out.print(mensaje);
                respuesta = entradaConsola.readLine();
            }
            catch (IOException ex){
                return "";
            }
        } while(respuesta == null);
        return respuesta;
    }

    public static int leerEntero(String mensaje){
        int n=0;
        boolean aconseguit = false;

        while(!aconseguit){
            try{
                n = Integer.parseInt(leerTexto(mensaje));
                aconseguit = true;
            }
            catch (NumberFormatException ex){
                System.out.println("Has d'introduir un nombre correcte");
            }
        }
        return n;
    }

    public static double leerDouble(String mensaje){
        double n = 0.0;
        boolean aconseguit = false;

        while (!aconseguit){
            try{
                n = Double.parseDouble(leerTexto(mensaje));
                aconseguit = true;
            }
            catch (NumberFormatException ex){
                System.out.println("Has d'introduir un nombre correcte");
            }
        }
        return n;
    }
}
