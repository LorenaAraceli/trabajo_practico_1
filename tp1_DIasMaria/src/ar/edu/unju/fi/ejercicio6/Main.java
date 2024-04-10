package ar.edu.unju.fi.ejercicio6;

import ar.edu.unju.fi.Model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el DNI:");
        String dni = scanner.nextLine();
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd):");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        
        

        Persona persona1 = new Persona(dni, nombre, fechaNacimiento);
        persona1.mostrarDatos();

        scanner.close();
    }
}
