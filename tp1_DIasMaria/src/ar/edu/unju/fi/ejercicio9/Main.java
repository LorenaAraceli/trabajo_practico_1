package ar.edu.unju.fi.ejercicio9;

import ar.edu.unju.fi.Model.Producto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Producto producto = new Producto();

            System.out.println("Ingrese el nombre del producto " + i + ":");
            producto.setNombre(scanner.nextLine());

            System.out.println("Ingrese el código del producto " + i + ":");
            producto.setCodigo(scanner.nextLine());

            System.out.println("Ingrese el precio del producto " + i + ":");
            producto.setPrecio(Double.parseDouble(scanner.nextLine()));

            System.out.println("Ingrese el descuento del producto " + i + " (entre 0 y 50):");
            producto.setDescuento(Integer.parseInt(scanner.nextLine()));

            System.out.println("Datos del producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: " + producto.calcularDescuento());
        }

        scanner.close();
    }
}