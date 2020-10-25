/* Codifique un programa en Java que permita ingresar dos números. Se le preguntará al usuario si
dichos números quiere sumarlos o restarlos. Si el usuario ingresa ‘S’ dichos números se sumarán; 
si ingresa ‘R’, se restará. La suma y la resta de dichos números debe realizarse con dos funciones.
En el caso de la suma, dicho método recibirá como parámetros los dos números ingresados y devolverá 
la suma de los dos números. En el caso de la resta se procederá de la misma manera, 
pero el método devolverá la resta de los mismos.*/
package ejercicio2;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        String operacion;
        
        System.out.println("Ingrese el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese la operacion que desea realizar:");
        System.out.println("Ingrese [s] si es suma o [r] si es resta.");
        operacion = entrada.next();
        
            if ((operacion.equals("S")) || (operacion.equals("s"))){
                int suma = sumarNumeros (numero1, numero2); 
                System.out.println("La suma de los numeros es: " +suma);
            }
            if ((operacion.equals("R")) || (operacion.equals("r"))){
                int resta = restarNumeros (numero1, numero2);
                System.out.println("La resta de los numeros es:" +resta);
            }
    }
    public static int sumarNumeros(int num1, int num2) {
        int suma = 0;
        suma = num1 + num2;
        return suma;
        
    }
    public static int restarNumeros(int numero1, int numero2) {
        int resta = 0;
        resta = numero1 - numero2;
        return resta;
        
    }
}


