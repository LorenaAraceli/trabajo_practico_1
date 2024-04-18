package ar.edu.unju.fi.ejercicio17;

import ar.edu.unju.fi.Model.Jugador;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                
                    System.out.println("Ingrese los datos del nuevo jugador:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Fecha de nacimiento (yyyy-MM-dd): ");
                    LocalDate fechaNacimiento = null;
                    boolean fechaValida = false;
                    while (!fechaValida) {
                        try {
                            fechaNacimiento = LocalDate.parse(scanner.nextLine());
                            fechaValida = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("Formato de fecha incorrecto. Ingrese la fecha nuevamente en formato yyyy-MM-dd:");
                        }
                    }
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = scanner.nextLine();
                    System.out.print("Estatura (en metros): ");
                    double estatura = scanner.nextDouble();
                    System.out.print("Peso (en kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Posición: ");
                    String posicion = scanner.nextLine();

                    try {
                        Jugador nuevoJugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                        jugadores.add(nuevoJugador);
                        System.out.println("Jugador agregado correctamente.");
                    } catch (Exception e) {
                        System.out.println("Error al agregar el jugador: " + e.getMessage());
                    }
                    break;
                case 2:
                	// Mostrar los datos del jugador
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombreBusqueda = scanner.nextLine();
                    System.out.print("Ingrese el apellido del jugador: ");
                    String apellidoBusqueda = scanner.nextLine();

                    boolean encontrado = false;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombreBusqueda) && jugador.getApellido().equalsIgnoreCase(apellidoBusqueda)) {
                            System.out.println("Datos del jugador:");
                            System.out.println("Nombre: " + jugador.getNombre());
                            System.out.println("Apellido: " + jugador.getApellido());
                            System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
                            System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                            System.out.println("Estatura: " + jugador.getEstatura() + " metros");
                            System.out.println("Peso: " + jugador.getPeso() + " kg");
                            System.out.println("Posición: " + jugador.getPosicion());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;
                case 3:
                	
                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores registrados.");
                    } else {
                        // Ordenar lista de jugadores por apellido
                        Collections.sort(jugadores, Comparator.comparing(Jugador::getApellido));

                        System.out.println("Jugadores ordenados por apellido:");
                        for (Jugador jugador : jugadores) {
                            System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
                            System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
                            System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                            System.out.println("Estatura: " + jugador.getEstatura() + " metros");
                            System.out.println("Peso: " + jugador.getPeso() + " kg");
                            System.out.println("Posición: " + jugador.getPosicion());
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                	 // Modificar datos del jugador
                    System.out.print("Ingrese el nombre del jugador a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    System.out.print("Ingrese el apellido del jugador a modificar: ");
                    String apellidoModificar = scanner.nextLine();

                    boolean modificado = false;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombreModificar) && jugador.getApellido().equalsIgnoreCase(apellidoModificar)) {
                            System.out.println("Ingrese los nuevos datos del jugador:");
                            System.out.print("Nuevo nombre: ");
                            jugador.setNombre(scanner.nextLine());
                            System.out.print("Nuevo apellido: ");
                            jugador.setApellido(scanner.nextLine());
                            System.out.print("Nueva fecha de nacimiento (YYYY-MM-DD): ");
                            jugador.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
                            System.out.print("Nueva nacionalidad: ");
                            jugador.setNacionalidad(scanner.nextLine());
                            System.out.print("Nueva estatura (metros): ");
                            jugador.setEstatura(Double.parseDouble(scanner.nextLine()));
                            System.out.print("Nuevo peso (kg): ");
                            jugador.setPeso(Double.parseDouble(scanner.nextLine()));
                            System.out.print("Nueva posición: ");
                            jugador.setPosicion(scanner.nextLine());
                            modificado = true;
                            System.out.println("Datos del jugador modificados correctamente.");
                            break;
                        }
                    }

                    if (!modificado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;
                case 5:
                    // Eliminar un jugador
                    System.out.print("Ingrese el nombre del jugador a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    System.out.print("Ingrese el apellido del jugador a eliminar: ");
                    String apellidoEliminar = scanner.nextLine();

                    boolean eliminado = false;
                    Iterator<Jugador> iterator = jugadores.iterator();
                    while (iterator.hasNext()) {
                        Jugador jugador = iterator.next();
                        if (jugador.getNombre().equalsIgnoreCase(nombreEliminar) && jugador.getApellido().equalsIgnoreCase(apellidoEliminar)) {
                            iterator.remove();
                            eliminado = true;
                            System.out.println("Jugador eliminado correctamente.");
                            break;
                        }
                    }

                    if (!eliminado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;
                case 6:
                  
                    System.out.println("Cantidad total de jugadores: " + jugadores.size());
                    break;
                case 7:
                	 
                    System.out.print("Ingrese la nacionalidad para ver la cantidad de jugadores: ");
                    String nacionalidadBuscar = scanner.nextLine();

                    int cantidadJugadoresNacionalidad = 0;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidadBuscar)) {
                            cantidadJugadoresNacionalidad++;
                        }
                    }

                    if (cantidadJugadoresNacionalidad > 0) {
                        System.out.println("La cantidad de jugadores de nacionalidad " + nacionalidadBuscar + " es: " + cantidadJugadoresNacionalidad);
                    } else {
                        System.out.println("No hay jugadores de nacionalidad " + nacionalidadBuscar + " en la lista.");
                    }
                    break;
                case 8:
                
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 8);

        scanner.close();
    }
}