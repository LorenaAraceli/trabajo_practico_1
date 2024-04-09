package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero entero: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero ingresado es par");
			System.out.println("El triple del numero es: " + (numero * 3));
		}else {
			System.out.println("El numero ingresado es impar");
			System.out.println("El doble del numero es: " + (numero * 2));
			
		}
		scanner.close();
	}
}