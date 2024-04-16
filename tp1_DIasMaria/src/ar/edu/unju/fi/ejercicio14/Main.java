package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero en el rango [3,10]:");
        int size = scanner.nextInt();
        
        if (size < 3 || size > 10) {
            System.out.println("El número ingresado está fuera del rango [3,10].");
            return;
        }
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un número entero para la posición " + i + ":");
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Valores en el ingresados y posicionados:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
            sum += array[i];
        }
        
        System.out.println("La suma de todos los valores es: " + sum);
        
        scanner.close();
    }
}