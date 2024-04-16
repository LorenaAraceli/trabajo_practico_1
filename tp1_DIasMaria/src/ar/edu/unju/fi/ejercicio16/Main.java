package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = new String[5];
        
       
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i+1) + ":");
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Valores en el array:");
        int index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }
        
        System.out.println("Tamaño del array: " + names.length);
        
  
        byte indexToRemove;
        do {
            System.out.println("Ingrese el índice del elemento a eliminar (0-4):");
            indexToRemove = scanner.nextByte();
        } while (indexToRemove < 0 || indexToRemove >= names.length);
        
        
        for (int i = (int)indexToRemove; i < names.length - 1; i++) {
            names[i] = names[i + 1];
        }
        names[names.length - 1] = ""; 
        
        System.out.println("Valor eliminado:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}
