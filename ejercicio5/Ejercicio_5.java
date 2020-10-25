/* Crea una función cantidadDeDivisores, que reciba un número entero y devuelva la cantidad de divisores
(por ejemplo, para el número 16, sus divisores son 1, 2, 4, 8, 16, por lo que la respuesta
debería ser 5). Ayuda: un número es múltiplo de otro cuando al dividir los números obtengo resto
0 (cero).*/
package ejercicio5;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero:");
        numero = entrada.nextInt();
                
        System.out.println("La cantidad de divisores del numero " +numero+ " es " +(cantidadDivisores(numero)));
    }
    public static int cantidadDivisores (int num) {
        int contador = 0;
        for(int i=1; i <= num; i++){
            if(num%i == 0){
            contador++;
            }
        }
        return contador;
    }
}
    
