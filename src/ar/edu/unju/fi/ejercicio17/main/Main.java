package ar.edu.unju.fi.ejercicio17.main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		int opcion;
		Scanner scanner = new Scanner(System.in);
	//	ArrayList<Jugador> jugadores = new ArrayList<>();
		
		
		 do {
	            System.out.println("\nMenú de opciones:");
	            System.out.println("1 - Alta de jugador");
	            System.out.println("2 - Mostrar los datos del jugador");
	            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
	            System.out.println("4 - Modificar los datos de un jugador");
	            System.out.println("5 - Eliminar un jugador");
	            System.out.println("6 - Mostrar la cantidad total de jugadores");
	            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
	            System.out.println("8 - Salir");

	            try {
	                System.out.print("Ingrese una opción: ");
	                opcion = scanner.nextInt();
	               

	                switch (opcion) {
	                    case 1:
	                        	
	                    	System.out.print("Alta de Jugador:");
	                       
	                        System.out.print("Nombre: ");
	                        String nombre = scanner.nextLine();
	                        System.out.print("Apellido: ");
	                        String apellido = scanner.nextLine();
	                        
	                        System.out.print("Ingrese la fecha de nacimiento (formato DD/MM/AAAA): ");
	                        String fechaStr = scanner.nextLine();
	                        String[] partesFecha = fechaStr.split("/");
	                        int dia = Integer.parseInt(partesFecha[0]);
	                        int mes = Integer.parseInt(partesFecha[1]) - 1;
	                        int anno = Integer.parseInt(partesFecha[2]);
	                        Calendar fechaNacimiento = Calendar.getInstance();
	                        fechaNacimiento.set(anno, mes, dia);
	                        
	                        System.out.print("Nacionalidad: ");
	                        String nacionalidad = scanner.nextLine();
	                        System.out.print("Estatura: ");
	                        double estatura = scanner.nextDouble();
	                        System.out.print("Peso: ");
	                        double peso = scanner.nextDouble();
	                        scanner.nextLine();
	                        System.out.print("Posición: ");
	                        String posicion = scanner.nextLine();

	                        
	                        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
	                //        jugadores.add(jugador);

	                        System.out.println("Jugador añadido correctamente.");
	                        
	                        break;
	                    case 2:
	                        
	                    	 System.out.println("Mostrar datos del jugador:");

	                         System.out.print("Ingrese el nombre del jugador: ");
	                          nombre = scanner.nextLine();
	                         System.out.print("Ingrese el apellido del jugador: ");
	                          apellido = scanner.nextLine();

	                         
	                         for (Jugador jugador : jugadores) {
	                             if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
	                                 
	                                 System.out.println(jugador);
	                                 return;
	                             }
	                         }

	                         System.out.println("Jugador no encontrado.");
	                     
	                        break;
	                    case 3:
	                    	System.out.println("Mostrar jugadores ordenados por apellido:");

	                        
	                        jugadores.sort(Comparator.comparing(Jugador::getApellido));

	                        
	                        for (Jugador jugador : jugadores) {
	                            System.out.println(jugador);
	                        }
	                    	
	                        break;
	                    case 4:
	                    	System.out.println("Modificar los datos de un jugador:");

	                        
	                        System.out.print("Ingrese el nombre del jugador: ");
	                        String nombre = scanner.nextLine();
	                        System.out.print("Ingrese el apellido del jugador: ");
	                        String apellido = scanner.nextLine();

	                        
	                        for (Jugador jugador : jugadores) {
	                            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
	                                
	                                System.out.print("Nuevo nombre: ");
	                                jugador.setNombre(scanner.nextLine());
	                                System.out.print("Nuevo apellido: ");
	                                jugador.setApellido(scanner.nextLine());
	                                
	                                System.out.print("Nueva fecha de nacimiento (formato DD/MM/AAAA): ");
	                                 fechaStr = scanner.nextLine();
	    	                         partesFecha = fechaStr.split("/");
	    	                         dia = Integer.parseInt(partesFecha[0]);
	    	                         mes = Integer.parseInt(partesFecha[1]) - 1;
	    	                         anno = Integer.parseInt(partesFecha[2]);
	    	                         fechaNacimiento = Calendar.getInstance();
	    	                         jugador.setFechaNacimiento(anno, mes, dia);
	    	                        
	                                System.out.print("Nueva nacionalidad: ");
	                                jugador.setNacionalidad(scanner.nextLine());
	                                System.out.print("Nueva estatura: ");
	                                jugador.setEstatura(scanner.nextDouble());
	                                System.out.print("Nuevo peso: ");
	                                jugador.setPeso(scanner.nextDouble());
	                                System.out.print("Nueva posición: ");
	                                jugador.setPosicion(scanner.nextLine());

	                                System.out.println("Datos modificados correctamente.");
	                                return;
	                            }
	                        }

	                        System.out.println("Jugador no encontrado.");
	                    	
	                    	
	                        break;
	                    case 5:
	                    	
	                    	System.out.println("Eliminar un jugador:");

	                        
	                        System.out.print("Ingrese el nombre del jugador: ");
	                         nombre = scanner.nextLine();
	                        System.out.print("Ingrese el apellido del jugador: ");
	                         apellido = scanner.nextLine();

	                       
	                        Iterator<Jugador> iterator = jugadores.iterator();
	                        while (iterator.hasNext()) {
	                            Jugador jugador = iterator.next();
	                            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
	                                iterator.remove();
	                                System.out.println("Jugador eliminado correctamente.");
	                                return;
	                            }
	                        }

	                        System.out.println("Jugador no encontrado.");
	                        
	                        break;
	                    case 6:
	                    	
	                    	System.out.println("Cantidad total de jugadores: " + jugadores.size());
	                
	                        
	                        break;
	                    case 7:
	                        
	                    	System.out.println("Mostrar la cantidad de jugadores por nacionalidad:");

	                       
	                        System.out.print("Ingrese la nacionalidad: ");
	                         nacionalidad = scanner.nextLine();

	                        
	                        int contador = 0;
	                        for (Jugador jugador : jugadores) {
	                            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
	                                contador++;
	                            }
	                        }

	                        System.out.println("Cantidad de jugadores de " + nacionalidad + ": " + contador);
	                    
	                    	
	                        break;
	                    case 8:
	                    	
	                        System.out.println("Saliendo del programa...");
	                        break;
	                        
	                    default:
	                        System.out.println("Opción no válida, por favor intente de nuevo.");
	                        break;
	                }
	            } catch (InputMismatchException) {
	                System.out.println("Error: Por favor ingrese un número.");
	            
	                opcion = 0;
	            }
	        } while (opcion != 8);
	        scanner.close();
	    }
		
		
    }


