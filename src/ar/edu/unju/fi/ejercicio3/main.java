package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int numero, resultado ;
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
            numero = scanner.nextInt();

        if (numero % 2 != 0) {
            resultado = numero * 2;
            System.out.println("El número ingresado es impar. El doble es: " + resultado);
        } else {
            resultado = numero * 3;
            System.out.println("El número ingresado es par. El triple es: " + resultado);
        }

        scanner.close();
	}

}
