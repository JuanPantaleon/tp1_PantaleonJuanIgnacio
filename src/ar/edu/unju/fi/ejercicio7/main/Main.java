package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos para un nuevo empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();
        // Crear el objeto Empleado utilizando el constructor parametrizado
        Empleado empleado1 = new Empleado(nombre, legajo, salario);
        // Mostrar los datos del empleado antes de darle un aumento
        System.out.println("Datos del empleado antes del aumento:");
        empleado1.mostrarDatos();
        // Darle un aumento al salario del empleado
        empleado1.darAumento();
        // Mostrar los datos del empleado después de darle un aumento
        System.out.println("Datos del empleado después del aumento:");
        empleado1.mostrarDatos();

        scanner.close();
	}

}
