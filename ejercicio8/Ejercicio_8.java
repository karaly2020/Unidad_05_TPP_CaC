/* Definir la función azar, que devuelva un número entero aleatorio entre 0 y un número recibido como
parámetro, sin incluir a este último. Ejemplo: Se invoca azar(10) → devuelve un número entre 0 y 9.*/
package ejercicio8;
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numMin = 0, numMax, aletorio;
        
        System.out.println("Ingrese el numero maximo del aletorio a generar:");
        numMax = entrada.nextInt();
        System.out.println ("El numero aleatorio entre " +numMin+ " y " +numMax+ " es " +(azar(numMin, numMax)));
    }
    public static int azar (int min, int max) {
        
        return (int)Math.floor(Math.random()*(min -(max-1))+ (max+1));
    }                          
}
    
