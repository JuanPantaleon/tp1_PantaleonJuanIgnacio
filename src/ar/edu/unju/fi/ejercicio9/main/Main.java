package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Crear 3 Productos
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del producto " + (i+1) + ":");
            Producto producto = new Producto();

            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Código: ");
            producto.setCodigo(scanner.nextLine());

            System.out.print("Precio: ");
            producto.setPrecio(Double.parseDouble(scanner.nextLine()));

            System.out.print("Descuento (entre 0 y 50): ");
            producto.setDescuento(Integer.parseInt(scanner.nextLine()));

            // Mostrar datos ingresados y resultado del descuento
            System.out.println("Datos del Producto " + (i+1) + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: " + producto.calcularDescuento());
            System.out.println();
        }

        scanner.close();
    }
		

}
