/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alexi
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    
    // Método para elevar al cuadrado un número entero
    public static int elevarAlCuadrado(int num) {
        return num * num;
    }

    // Método para multiplicar dos números flotantes
    public static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    // Método para multiplicar dos números sin parte flotante y concatenar el resultado con un caracter
    public static String multiplicarYConcatenar(int num1, int num2, char letra) {
        int resultado = num1 * num2;
        return letra + String.valueOf(resultado);
    }

    

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // primer método
        System.out.print("Ingrese un número entero para elevar al cuadrado: ");
        int numEntero = scanner.nextInt();
        int resultado = elevarAlCuadrado(numEntero);
        System.out.println("Resultado al cuadrado: " + resultado);

        //segundo método
        System.out.print("\nIngrese el primer número flotante: ");
        float num1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo número flotante: ");
        float num2 = scanner.nextFloat();
        float resultadoMultiplicacion = multiplicar(num1, num2);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        // tercer método
        System.out.print("\nIngrese el primer número entero: ");
        int nume1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int nume2 = scanner.nextInt();
        System.out.print("Ingrese un carácter: ");
        char letra = scanner.next().charAt(0); // Tomar el primer carácter ingresado
        String resultadoConcatenado = multiplicarYConcatenar(nume1, nume2, letra);
        System.out.println("Resultado concatenado: " + resultadoConcatenado);

        scanner.close();
    }
    
}
