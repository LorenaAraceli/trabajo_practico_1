package ar.edu.unju.fi.ejercicio8;

import ar.edu.unju.fi.Model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = Integer.parseInt(scanner.nextLine());

        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(n);

        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("La productoria es: " + calculadora.calcularProductoria());

        scanner.close();
    }
}
