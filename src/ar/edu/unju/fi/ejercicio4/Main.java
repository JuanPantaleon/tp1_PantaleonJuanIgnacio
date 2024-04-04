package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			int factorial,contador,numero;
			
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número entre 0 y 10 para calcular su factorial:");
	        boolean b = scanner.hasNextInt();
	        if(b == false) {
	        	System.out.println("El número debe estar dentro del rango [0, 10].");
	        }else {
	        	
	        	 numero = scanner.nextInt();
	        	
	        if ((numero < 0 || numero > 10) && b == true ) {
	            System.out.println("El número debe estar dentro del rango [0, 10].");
	        } else {
	            factorial = 1;
	            contador = 1;

	            while (contador <= numero) {
	                factorial *= contador;
	                contador++;
	            }

	            System.out.println("El factorial de " + numero + " es: " + factorial);
	        }
	        }
	        	
	      
		
		
	}}

