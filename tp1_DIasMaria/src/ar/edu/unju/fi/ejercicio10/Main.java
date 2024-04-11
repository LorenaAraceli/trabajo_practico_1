package ar.edu.unju.fi.ejercicio10;

import ar.edu.unju.fi.Model.Pizza;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el diámetro de la pizza (20, 30 o 40):");
            int diametro = scanner.nextInt();

            System.out.println("¿Lleva ingredientes especiales? (true/false):");
            boolean ingredientesEspeciales = scanner.nextBoolean();

            Pizza pizza = new Pizza(diametro, ingredientesEspeciales);
            pizza.calcularPrecio();
            pizza.calcularArea();

            System.out.println("Precio de la pizza: $" + pizza.getPrecio());
            System.out.println("Área de la pizza: " + pizza.getArea() + " cm^2");
        }
    }
}
