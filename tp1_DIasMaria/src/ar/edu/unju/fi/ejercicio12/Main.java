package ar.edu.unju.fi.ejercicio12;

import ar.edu.unju.fi.Model.Persona2;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(Integer.parseInt(partesFecha[2]), Integer.parseInt(partesFecha[1]) - 1, Integer.parseInt(partesFecha[0]));

        Persona2 persona2 = new Persona2(nombre, fechaNacimiento);

        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaNacimientoStr);
        System.out.println("Edad: " + persona2.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona2.obtenerSignoZodiaco());
        System.out.println("Estación del año: " + persona2.obtenerEstacion());
    }
}
