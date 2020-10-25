/* Crea una función esPar que devuelva el valor lógico true o false según si el número que se indique 
como parámetro es par o no lo es.*/
package ejercicio3;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero:");
        numero = entrada.nextInt();
        
        if (esPar (numero)){
            System.out.println("El numero " +numero+ " es par");
        }else{
            System.out.println("El numero " +numero+ " es impar");
        }
    }
    public static boolean esPar (int num) {
        return num % 2 == 0;
    }
}
    
