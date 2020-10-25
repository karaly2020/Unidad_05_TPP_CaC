/* Crea una función cubo, que reciba un número y lo devuelva elevado al cubo.*/
package ejercicio4;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero:");
        numero = entrada.nextInt();
        
        System.out.println("El cubo del numero " +numero+ " es " +(elevarAlCubo(numero)));
    }
    public static double elevarAlCubo (double num) {
        double cubo = Math.pow(num, 3);
        return cubo;
    }
}
    
