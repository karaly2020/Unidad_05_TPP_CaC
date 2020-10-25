/* Escribir el procedimiento imprimirSimbolo, que imprima por consola n veces un carácter en la misma línea. 
Tanto n como el caracter se reciben como parámetro. Ejemplo: Se invoca imprimirSimbolo(5,’#’) →
imprime “#####”..*/
package ejercicio7;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        char simbolo;
        System.out.print("Ingrese la cantidad de veces que desea imprimir el caracter:");
        numero = entrada.nextInt();
        System.out.print("Ingrese el simbolo que desea ingresar:");
        simbolo = entrada.next().charAt(0);
        
        imprimirSimbolo(numero, simbolo);     
    }
    public static void imprimirSimbolo (int num, char caracter) {
        for (int i = 0; i<num; i++){
        System.out.print(caracter);
        }
        System.out.println(" ");
    }
}
    
