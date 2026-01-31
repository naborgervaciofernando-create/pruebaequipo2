package pruebaequipo2;

public class Division {

   
    public static int operacion(int a, int b) {
       
        if (b == 0) {
            System.out.println("Error: No es posible dividir entre cero.");
            return 0;
        }
        return a / b;
    }
}