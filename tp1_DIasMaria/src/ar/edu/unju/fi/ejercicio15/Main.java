package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero en el rango [5,10]:");
        int size = scanner.nextInt();
        
        if (size < 5 || size > 10) {
            System.out.println("El número ingresado está fuera del rango [5,10].");
            return;
        }
        
        String[] names = new String[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un nombre para la posición " + i + ":");
            names[i] = scanner.next();
        }
        
        System.out.println("Valores ingresados (comenzando por el primer índice 0):");
        for (int i = 0; i < size; i++) {
            System.out.println("Posición " + i + ": " + names[i]);
        }
        
        System.out.println("Valores ingresados (comenzando por la última posición):");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + names[i]);
        }
        
        scanner.close();
    }
}
