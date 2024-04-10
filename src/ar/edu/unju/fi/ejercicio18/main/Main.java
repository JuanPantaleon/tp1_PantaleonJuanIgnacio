package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.Pais;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;

public class Main {

	private static ArrayList<DestinoTuristico> destinosTuristicos = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();

	
	
	public static void main(String[] args) {
		precargarPaises();
        menuOpciones();
    }
	
	private static void menuOpciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n**Menú de opciones:**");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destino turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");

            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico();
                        break;
                    case 2:
                        mostrarDestinosTuristicos();
                        break;
                    case 3:
                        modificarPaisDestinoTuristico();
                        break;
                    case 4:
                        limpiarDestinosTuristicos();
                        break;
                    case 5:
                        eliminarDestinoTuristico();
                        break;
                    case 6:
                        mostrarDestinosTuristicosOrdenadosPorNombre();
                        break;
                    case 7:
                        mostrarPaises();
                        break;
                    case 8:
                        mostrarDestinosTuristicosPorPais();
                        break;
                    case 9:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Ingrese un número del 1 al 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            } catch (Exception e) {
                System.out.println("Se produjo un error inesperado. " + e.getMessage());
            } finally {
                scanner.nextLine();
            }
        } while (opcion != 9);
        
        scanner.close();
    }

	private static void altaDestinoTuristico() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese el código del destino turístico: ");
	    int codigo = scanner.nextInt();

	    System.out.println("Ingrese el nombre del destino turístico: ");
	    String nombre = scanner.nextLine();

	    System.out.println("Ingrese el precio del destino turístico: ");
	    double precio = scanner.nextDouble();

	    System.out.println("Ingrese el código del país del destino turístico: ");
	    int codigoPais = scanner.nextInt();

	    Pais pais = buscarPaisPorCodigo(codigoPais);

	    System.out.println("Ingrese la cantidad de días del destino turístico: ");
	    int cantidadDias = scanner.nextInt();

	    DestinoTuristico destinoTuristico = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
	    destinosTuristicos.add(destinoTuristico);

	    System.out.println("Destino turístico creado correctamente.");
	    
	    scanner.close();
	}

	private static Pais buscarPaisPorCodigo(int codigo) {
	    for (Pais pais : paises) {
	        if (pais.getCodigo() == codigo) {
	            return pais;
	        }
	    }
	    return null;
	}
	
	private static void mostrarDestinosTuristicos() {
	    if (destinosTuristicos.isEmpty()) {
	        System.out.println("No hay destinos turísticos registrados.");
	    } else {
	        for (DestinoTuristico destinoTuristico : destinosTuristicos) {
	            System.out.println(destinoTuristico);
	        }
	    }
	}
	
	private static void modificarPaisDestinoTuristico() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese el código del destino turístico: ");
	    int codigo = scanner.nextInt();

	    DestinoTuristico destinoTuristico = buscarDestinoTuristicoPorCodigo(codigo);

	    if (destinoTuristico != null) {
	        System.out.println("Ingrese el código del nuevo país: ");
	        int codigoPais = scanner.nextInt();

	        Pais nuevoPais = buscarPaisPorCodigo(codigoPais);

	        if (nuevoPais != null) {
	            destinoTuristico.setPais(nuevoPais);
	            System.out.println("El país del destino turístico se ha modificado correctamente.");
	        } else {
	            System.out.println("El código del país no es válido.");
	        }
	    } else {
	        System.out.println("El código del destino turístico no es válido.");
	    }
	    scanner.close();
	}

	private static DestinoTuristico buscarDestinoTuristicoPorCodigo(int codigo) {
	    for (DestinoTuristico destinoTuristico : destinosTuristicos) {
	        if (destinoTuristico.getCodigo() == codigo) {
	            return destinoTuristico;
	        }
	    }
	    return null;
	}
	
	private static void limpiarDestinosTuristicos() {
	    destinosTuristicos.clear();
	    System.out.println("El ArrayList de destinos turísticos se ha limpiado correctamente.");
	}
	
	private static void eliminarDestinoTuristico() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese el código del destino turístico a eliminar: ");
	    int codigo = scanner.nextInt();

	    Iterator<DestinoTuristico> it = destinosTuristicos.iterator();

	    while (it.hasNext()) {
	        DestinoTuristico destinoTuristico = it.next();
	        if (destinoTuristico.getCodigo() == codigo) {
	            it.remove();
	            System.out.println("Destino turístico eliminado correctamente.");
	            break;
	        }
	    }

	    if (!it.hasNext()) {
	        System.out.println("El código del destino turístico no es válido.");
	    }
	    scanner.close();
	}
	
	
	private static void mostrarDestinosTuristicosOrdenadosPorNombre() {
	    Collections.sort(destinosTuristicos, (d1, d2) -> d1.getNombre().compareTo(d2.getNombre()));

	    if (destinosTuristicos.isEmpty()) {
	        System.out.println("No hay destinos turísticos registrados.");
	    } else {
	        for (DestinoTuristico destinoTuristico : destinosTuristicos) {
	            System.out.println(destinoTuristico);
	        }
	    }
	}
	
	private static void mostrarPaises() {
	    if (paises.isEmpty()) {
	        System.out.println("No hay países registrados.");
	    } else {
	        for (Pais pais : paises) {
	            System.out.println(pais);
	        }
	    }
	}
	
	private static void mostrarDestinosTuristicosPorPais() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese el código del país: ");
	    int codigoPais = scanner.nextInt();

	    Pais pais = buscarPaisPorCodigo(codigoPais);

	    if (pais != null) {
	        System.out.println("Destinos turísticos del país " + pais.getNombre() + ":");
	        for (DestinoTuristico destinoTuristico : destinosTuristicos) {
	            if (destinoTuristico.getPais().getCodigo() == codigoPais) {
	                System.out.println(destinoTuristico);
	            }
	        }
	    } else {
	        System.out.println("El código del país no es válido.");
	    }
	    scanner.close();
	}
	
	
	private static void precargarPaises() {
	    

	    paises.add(new Pais(1, "Argentina"));
	    paises.add(new Pais(2, "Brasil"));
	    paises.add(new Pais(3, "Chile"));
	    paises.add(new Pais(4, "Colombia"));
	    paises.add(new Pais(5, "Ecuador"));
	    paises.add(new Pais(6, "Paraguay"));
	    paises.add(new Pais(7, "Perú"));
	    paises.add(new Pais(8, "Uruguay"));
	    paises.add(new Pais(9, "Venezuela"));

	    
	}
}

	
	

