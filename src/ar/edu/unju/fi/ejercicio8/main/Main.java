package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		// Crear objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial();

        // Configurar el valor de k
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de k:");
        int k = scanner.nextInt();
        calculadora.setK(k);
        scanner.close();

        // Calcular la sumatoria, productoria y mostrar el resultado
        System.out.println("El resultado de la sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("El resultado de la productoria es: " + calculadora.calcularProductoria());
    }
	}

