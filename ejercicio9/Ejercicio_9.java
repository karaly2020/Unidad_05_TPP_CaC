/* Escribir la función esVocal, que devuelva true o false según si un caracter recibido como parámetro
es vocal (contemplar mayúsculas y minúsculas). Ejemplo: Se invoca esVocal(‘a’) → devuelve true.*/
package ejercicio9;
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra, vocal;
        System.out.println("Ingrese una letra: ");
        letra = entrada.next().charAt(0);
        
        System.out.println ("La letra ingresada " +letra+ " es " +(esVocal(letra)));
    }
    public static boolean esVocal (char letra) {
        
        if ((letra == 'a') || (letra == 'A')|| (letra == 'e') || (letra == 'E') || 
            (letra == 'i') || (letra == 'I')|| (letra == 'o') || (letra == 'O') ||
            (letra == 'u') || (letra == 'U')){
            return true;
        }
        else
            return false;  
    }
}
    
