package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   	Scanner scanner = new Scanner(System.in);
	/*	
     	 Persona persona1 = new Persona();
		 System.out.println("Datos de la persona creada con constructor por defecto:");
	     persona1.mostrarDatos();
		 
		 
		 System.out.println("Ingrese el DNI de la persona:");
	        String dni = scanner.next();
	        System.out.println("Ingrese el nombre de la persona:");
	        String nombre = scanner.next();
	        System.out.println("Ingrese la fecha de nacimiento de la persona (formato: YYYY-MM-DD):");
	        String fechaNacimientoStr = scanner.next();
	        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
	        System.out.println("Ingrese la provincia de la persona:");
	        String provincia = scanner.next();
	        
	        Persona persona2 = new Persona();
	        persona2.setDni(dni);
	        persona2.setNombre(nombre);
	        persona2.setFechaNacimiento(fechaNacimiento);
	        persona2.setProvincia(provincia);
	        
	        persona2.mostrarDatos();
	        
	        scanner.close();
		 */
	   	
	    // Construcción de un objeto Persona utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Datos de la persona creada con constructor por defecto:");
        persona1.mostrarDatos();

        // Construcción de un objeto Persona utilizando el constructor parametrizado
        System.out.println("Ingrese el DNI de la persona:");
        String dni = scanner.next();
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento de la persona (formato: YYYY-MM-DD):");
        String fechaNacimientoStr = scanner.next();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        System.out.println("Ingrese la provincia de la persona:");
        String provincia = scanner.next();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        System.out.println("Datos de la persona creada con constructor parametrizado:");
        persona2.mostrarDatos();

        // Construcción de un objeto Persona utilizando el constructor que inicializa dni, nombre y fecha de nacimiento
        System.out.println("\nIngrese nuevamente el DNI de la persona:");
        dni = scanner.next();
        System.out.println("Ingrese nuevamente el nombre de la persona:");
        nombre = scanner.next();
        System.out.println("Ingrese nuevamente la fecha de nacimiento de la persona (formato: YYYY-MM-DD):");
        fechaNacimientoStr = scanner.next();
        fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        System.out.println("Datos de la persona creada con constructor que inicializa dni, nombre y fecha de nacimiento:");
        persona3.mostrarDatos();

        scanner.close();
	}

}
