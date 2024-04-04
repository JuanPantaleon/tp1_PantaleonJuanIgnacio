package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero,resultado,i;
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número entero entre 1 y 9:");
	        numero = scanner.nextInt();

	        if (numero < 1 || numero > 9) {
	            System.out.println("El número debe ser mayor que 0 y menor que 10.");
	        } else {
	            System.out.println("Tabla de multiplicar del numero " + numero + ":");


	            for ( i = 1; i <= 10; i++) {
	                resultado = numero * i;
	                System.out.println(numero + " x " + i + " = " + resultado);
	            }
	        }
	        scanner.close();
	}

}
