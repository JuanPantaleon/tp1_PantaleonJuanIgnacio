package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {


	    private String nombre;
	    private int legajo;
	    private double salario;
	    private static final double salarioMinimo = 210000.00;
	    private static final double aumentoPorMeritos = 20000.00;
	    
	    
		public Empleado() {
			super();
		}

		public Empleado(String nombre, int legajo, double salario) {
			super();
			this.nombre = nombre;
			this.legajo = legajo;
			if (salario >= salarioMinimo) {
	            this.salario = salario;
	        } else {
	            this.salario = (double)salarioMinimo;
	        }
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getLegajo() {
			return legajo;
		}

		public void setLegajo(int legajo) {
			this.legajo = legajo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public static double getSalariominimo() {
			return salarioMinimo;
		}

		public static double getAumentopormeritos() {
			return aumentoPorMeritos;
		}
	
	     // Método para mostrar los datos del empleado
        public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + salario);
    }
    
        // Método para dar un aumento al salario del empleado
    public void darAumento() {
        salario += aumentoPorMeritos;
    }
    
    
	}