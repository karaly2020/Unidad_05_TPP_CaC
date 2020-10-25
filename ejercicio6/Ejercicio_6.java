/* Crea una función mayorDeTres, que reciba tres números enteros y devuelva el valor del mayor de ellos. 
Por ejemplo, para los números 5, 7 y 5, devolvería el valor 7.*/
package ejercicio6;
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Ingrese el primero numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero:");
        numero3 = entrada.nextInt();
        
        System.out.println("El numero mayor de los tres numeros es " +(mayorDeTres(numero1, numero2, numero3)));
    }
    public static int mayorDeTres (int num1, int num2, int num3) {
        int numeroMayor = 0;
        if ((num1 > num2) && (num1 > num3)){
            numeroMayor = num1;
        }else if ((num2 > num1)&& (num2 > num3)){
            numeroMayor = num2;
        }else if ((num3 > num1)&& (num3 > num2)){
            numeroMayor = num3; 
        }      
        return numeroMayor;
    }                    
}
    
