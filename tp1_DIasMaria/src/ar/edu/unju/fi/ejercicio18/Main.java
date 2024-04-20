package ar.edu.unju.fi.ejercicio18;

import ar.edu.unju.fi.Model.DestinoTuristico;
import ar.edu.unju.fi.Model.Pais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Pais> paises = new ArrayList<>();*/
        Set<Pais> paises = new HashSet<>();
        paises.add(new Pais(1, "España"));
        paises.add(new Pais(2, "Italia"));
        paises.add(new Pais(1, "España"));
        paises.add(new Pais(2, "Italia"));
        paises.add(new Pais(3, "Francia"));
        paises.add(new Pais(4, "Japón"));
        paises.add(new Pais(5, "Australia"));
        paises.add(new Pais(6, "Estados Unidos"));
        paises.add(new Pais(7, "Canadá"));
        paises.add(new Pais(8, "México"));
        paises.add(new Pais(9, "Brasil"));
        paises.add(new Pais(10, "Argentina"));
        paises.add(new Pais(11, "Alemania"));
        paises.add(new Pais(12, "China"));
        paises.add(new Pais(13, "India"));
        paises.add(new Pais(14, "Rusia"));
        paises.add(new Pais(15, "Egipto"));
        paises.add(new Pais(16, "Sudáfrica"));
        paises.add(new Pais(17, "Nueva Zelanda"));
        paises.add(new Pais(18, "Corea del Sur"));
        paises.add(new Pais(19, "Turquía"));
        paises.add(new Pais(20, "Grecia"));
        

        ArrayList<DestinoTuristico> destinos = new ArrayList<>();
       
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
        	try {
                System.out.println("Menú de opciones:");
                System.out.println("1 – Alta de destino turístico");
                System.out.println("2 – Mostrar todos los destinos turísticos");
                System.out.println("3 - Modificar el pais de un destino turistico");
                System.out.println("4 - Limpiar al ArrayList de destino Turiscos");
                System.out.println("5 - Eliminar un destino turistico");
                System.out.println("6 - Mostrar los destinos turisticos ordenados por nombre");
                System.out.println("7 - Mostrar todos los paises");
                System.out.println("8 - Mostrar los turistucos que pertenecen a un pais");
                System.out.println("9 - Salir");

                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
            
                switch (opcion) {
                  
                case 1:
                    // Alta de destino turístico
                    try {
                        System.out.println("Ingrese el código del destino turístico:");
                        int codigoDestino = scanner.nextInt();

                        System.out.println("Ingrese el nombre del destino turístico:");
                        scanner.nextLine(); // Limpiar el buffer
                        String nombreDestino = scanner.nextLine();

                        System.out.println("Ingrese el precio del destino turístico:");
                        double precioDestino = scanner.nextDouble();

                        System.out.println("Ingrese el código del país:");
                        int codigoPais = scanner.nextInt();
                        Pais paisAsociado = null;
                        for (Pais pais : paises) {
                            if (pais.getCodigo() == codigoPais) {
                                paisAsociado = pais;
                                break;
                            }
                        }
                        if (paisAsociado == null) {
                            System.out.println("El país ingresado no existe.");
                            break;
                        }

                        System.out.println("Ingrese la cantidad de días:");
                        int cantidadDias = scanner.nextInt();

                        DestinoTuristico nuevoDestino = new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, paisAsociado, cantidadDias);
                        destinos.add(nuevoDestino);
                        System.out.println("Destino turístico agregado correctamente.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Ingresa un valor válido para el precio o la cantidad de días.");
                        scanner.next(); // Limpiar el buffer del scanner
                    }
                    break;
         
                    case 2:
                        // Mostrar todos los destinos turísticos
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos para mostrar.");
                        } else {
                            System.out.println("Listado de destinos turísticos:");
                            for (DestinoTuristico destino : destinos) {
                                System.out.println("Código: " + destino.getCodigo());
                                System.out.println("Nombre: " + destino.getNombre());
                                System.out.println("Precio: " + destino.getPrecio());
                                System.out.println("País: " + destino.getPais().getNombre());
                                System.out.println("Cantidad de días: " + destino.getCantidadDias());
                                System.out.println("----------------------------------------");
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.println("Ingrese el código del destino turístico a modificar el país: ");
                        int codigoModificar = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        DestinoTuristico destinoModificar = null;
                        for (DestinoTuristico destino : destinos) {
                            if (destino.getCodigo() == codigoModificar) {
                                destinoModificar = destino;
                                break;
                            }
                        }

                        if (destinoModificar == null) {
                            System.out.println("No se encontró ningún destino turístico con el código ingresado.");
                        } else {
                            System.out.println("Ingrese el nuevo código del país:");
                            int nuevoCodigoPais = scanner.nextInt();
                            Pais nuevoPaisAsociado = null;
                            for (Pais pais : paises) {
                                if (pais.getCodigo() == nuevoCodigoPais) {
                                    nuevoPaisAsociado = pais;
                                    break;
                                }
                            }
                            if (nuevoPaisAsociado == null) {
                                System.out.println("El nuevo país ingresado no existe.");
                            } else {
                                destinoModificar.setPais(nuevoPaisAsociado);
                                System.out.println("País del destino turístico modificado correctamente.");
                            }
                        }
                        break;
                    case 4:
                        destinos.clear();
                        System.out.println("ArrayList de destinos turísticos limpiado correctamente.");
                        break;
                        
                    case 5:
                        System.out.println("Ingrese el código del destino turístico a eliminar: ");
                        int codigoEliminar = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        boolean destinoEliminado = false;
                        Iterator<DestinoTuristico> iterator = destinos.iterator();
                        while (iterator.hasNext()) {
                            DestinoTuristico destino = iterator.next();
                            if (destino.getCodigo() == codigoEliminar) {
                                iterator.remove();
                                destinoEliminado = true;
                                break;
                            }
                        }

                        if (destinoEliminado) {
                            System.out.println("Destino turístico eliminado con éxito.");
                        } else {
                            System.out.println("No se encontró ningún destino turístico con el código ingresado.");
                    }
                    break;
                    case 6:
                        // Mostrar destinos turísticos ordenados por nombre
                        if (destinos.isEmpty()) {
                            System.out.println("No hay destinos turísticos para mostrar.");
                        } else {
                            System.out.println("Destinos turísticos ordenados por nombre:");
                            Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
                            for (DestinoTuristico destino : destinos) {
                                System.out.println(destino.getNombre() + " - " + destino.getPais().getNombre());
                            }
                        }
                        break;
                       
                    case 8:
                        // Mostrar los destinos turísticos que pertenecen a un país
                        System.out.println("Ingrese el código del país:");
                        int codigoPaisBusqueda = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        boolean destinosEncontrados = false;
                        System.out.println("Destinos turísticos para el país con código " + codigoPaisBusqueda + ":");
                        for (DestinoTuristico destino : destinos) {
                            if (destino.getPais().getCodigo() == codigoPaisBusqueda) {
                                System.out.println("Código: " + destino.getCodigo() + ", Nombre: " + destino.getNombre());
                                destinosEncontrados = true;
                            }
                        }

                        if (!destinosEncontrados) {
                            System.out.println("No se encontraron destinos turísticos para el país con código " + codigoPaisBusqueda);
                        }
                        break;
                    case 9:
                        System.out.println("Saliendo del programa");
                        opcion = 9; // Salir del bucle while
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
                
  
        	} catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número entero correspondiente a una opción del menú.");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            } finally {
                System.out.println("----------------------------------------");
            }
        } while (opcion != 9);
        
        scanner.close();
    }
}
