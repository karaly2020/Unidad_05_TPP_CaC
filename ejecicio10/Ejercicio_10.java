/* Escribir la función obtenerMesEnTexto, que devuelva una cadena que representa un mes expresado en letras
según un número entero entre 1 y 12 recibido como parámetro. Si el parámetro no es válido, devolver una cadena
vacía. Ejemplo: Se invoca obtenerMesEnTexto(4) → devuelve “Abril”..*/
package ejecicio10;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //String mesEnTexto = "";
        int mesEnNumero;
        
        System.out.print("Digite un numero entre 1 y 12: ");
        mesEnNumero = entrada.nextInt();
                        
        System.out.println ("El mes ingresado en numero " +mesEnNumero+ " es " +(obtenerMesEnTexto(mesEnNumero)));
    }
    public static String obtenerMesEnTexto (int mes) {
        String mesEnTexto = " ";    
        
        switch (mes){
            case 1:
                mesEnTexto ="Enero";break;
            case 2:
                mesEnTexto ="Febrero";break;
            case 3:
                mesEnTexto ="Marzo";break;
            case 4:
                mesEnTexto ="Abril";break;
            case 5:
                mesEnTexto ="Mayo";break;
            case 6:
                mesEnTexto ="Junio";break;
            case 7:
                mesEnTexto ="Julio";break;
            case 8:
                mesEnTexto ="Agosto";break;
            case 9:
                mesEnTexto ="Septiembre";break;
            case 10:
                mesEnTexto ="Octubre";break;
            case 11:
                mesEnTexto ="Noviembre";break;
            case 12:
                mesEnTexto ="Diciembre";break;
            default:
                mesEnTexto =" ";  
        }
        return mesEnTexto;
    }
}
    
