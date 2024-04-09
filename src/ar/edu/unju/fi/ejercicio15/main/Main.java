package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int tamanoArray;
        
        do {
            System.out.print("Ingrese un número entero en el rango [5, 10]: ");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        
        String[] nombres = new String[tamanoArray];


        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            nombres[i] = scanner.next();
        }

        //primer índice
        System.out.println("Contenido del array (comenzando desde el primer índice):");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //ultima posicion
        System.out.println("Contenido del array (comenzando desde la última posición):");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println(nombres[i]);
        }

        scanner.close();
	}

}
