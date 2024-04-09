package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int tamano;

		Scanner scanner = new Scanner(System.in);
		
        do {
            System.out.print("Ingrese un número entero en el rango [3, 10]: ");
            tamano = scanner.nextInt();
        } while (tamano < 3 || tamano > 10);
     
        int[] numeros = new int[tamano];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Valores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        
        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();
	}

}
