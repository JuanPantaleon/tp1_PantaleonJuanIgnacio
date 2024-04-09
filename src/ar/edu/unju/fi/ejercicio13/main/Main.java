package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 int[] numeros = new int[8];
	
		 Scanner scanner = new Scanner(System.in);
		 
		 for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese un número entero para la posición " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }
		 
		 System.out.println("Valores almacenados en el array:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	        scanner.close();
	}
}
