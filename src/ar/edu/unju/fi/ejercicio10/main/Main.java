package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Crear 3 objetos Pizza
    for (int i = 1; i < 4; i++) {
    	
        System.out.println("** Pizza " + (i) + " **");

        Pizza pizza = new Pizza();

        // Solicitar al usuario que ingrese el diametro
        System.out.print("Ingrese el diámetro de la pizza (20, 30, 40): ");
      //  int diametro= Integer.parseInt(scanner.nextLine());
        	int diametro = scanner.nextInt();
        // Validar diametro
        if (diametro != 20 && diametro != 30 && diametro!= 40) {
            System.out.println("El diámetro ingresado no es válido.");
            continue;
        }

        // Establecer el diámetro de la pizza
        pizza.setDiametro(diametro);

        // Solicitar al usuario si lleva ingredientes especiales
        System.out.print("¿Lleva ingredientes especiales? (true/false): ");
        pizza.setIngredientesEspeciales(scanner.nextBoolean());

        // Calcular el precio y el area de la pizza
        pizza.calcularPrecio();
        pizza.calcularArea();

        // Mostrar los detalles de la pizza
        System.out.println("Diámetro = " + pizza.getDiametro());
        System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
        System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
        System.out.println("Área de la pizza = " + pizza.getArea());
        System.out.println();
    }

    scanner.close();
}
}
