package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
	   	Scanner scanner = new Scanner(System.in);
	   	
	   // Construcción de un objeto Persona utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Ingrese el DNI de la persona:");
        String dni1 = scanner.next();
        persona1.setDni(dni1);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre1 = scanner.next();
        persona1.setNombre(nombre1);
        System.out.println("Ingrese la fecha de nacimiento de la persona (formato: YYYY-MM-DD):");
        String fechaNacimientoStr1 = scanner.next();
        LocalDate fechaNacimiento1 = LocalDate.parse(fechaNacimientoStr1);
        persona1.setFechaNacimiento(fechaNacimiento1);
        System.out.println("Ingrese la provincia de la persona:");
        String provincia1 = scanner.next();
        persona1.setProvincia(provincia1);
        
        System.out.println("Datos de la persona creada con constructor por defecto:");
        persona1.mostrarDatos();
        
        

        // Construcción de un objeto Persona utilizando el constructor parametrizado
        System.out.println("Ingrese el DNI de la persona:");
        String dni2 = scanner.next();
        System.out.println("Ingrese el nombre de la persona:");
        String nombre2 = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento de la persona (formato: YYYY-MM-DD):");
        String fechaNacimientoStr2= scanner.next();
        LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimientoStr2);
        System.out.println("Ingrese la provincia de la persona:");
        String provincia2 = scanner.next();
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        System.out.println("Datos de la persona creada con constructor parametrizado:");
        persona2.mostrarDatos();

        // Construcción de un objeto Persona utilizando el constructor que inicializa dni, nombre y fecha de nacimiento
        System.out.println("Ingrese nuevamente el DNI de la persona:");
        String dni3 = scanner.next();
        System.out.println("Ingrese nuevamente el nombre de la persona:");
        String nombre3 = scanner.next();
        System.out.println("Ingrese nuevamente la fecha de nacimiento de la persona (formato: YYYY-MM-DD):");
        String fechaNacimientoStr3 = scanner.next();
        LocalDate fechaNacimiento3 = LocalDate.parse(fechaNacimientoStr3);
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        System.out.println("Datos de la persona creada con constructor que inicializa dni, nombre y fecha de nacimiento:");
        persona3.mostrarDatos();

        scanner.close();
	}

}
