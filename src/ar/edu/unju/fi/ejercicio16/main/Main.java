package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] nombres = new String[5];
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Ingrese 5 nombres:");

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = scanner.nextLine();
        }
        
        System.out.println("Nombres ingresados:");
        int j = 0;
        while (j < nombres.length) {
            System.out.println(nombres[j]);
            j++;
        }
        
        System.out.println("Tamaño del arreglo: " + nombres.length);
        
        byte indice;
        do {
            System.out.println("Ingrese el índice del elemento a eliminar (0-4):");
            indice = scanner.nextByte();
        } while (indice < 0 || indice >= nombres.length);

        
        for (int k = (int)indice; k < nombres.length - 1; k++) {
            nombres[k] = nombres[k + 1];
        }
        nombres[nombres.length - 1] = ""; 

        System.out.println("Arreglo después de eliminar el elemento en el índice " + indice + ":");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
	}

}
