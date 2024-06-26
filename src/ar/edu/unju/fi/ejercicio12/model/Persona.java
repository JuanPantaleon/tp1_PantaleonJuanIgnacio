package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
		private String nombre;
		private Calendar nacimiento;
		
		
		public Persona(String nombre, Calendar nacimiento) {
			super();
			this.nombre = nombre;
			this.nacimiento = nacimiento;
		}
	
		//Getters & Setters

		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Calendar getNacimiento() {
			return nacimiento;
		}


		public void setNacimiento(Calendar nacimiento) {
			this.nacimiento = nacimiento;
		}
		
		
		

		public int calcularEdad() {
			Calendar hoy = Calendar.getInstance();
			int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
			
			if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
	            edad--;
	        }
	        return edad;
		}
		
		
		public String obtenerSignoZodiaco() {
	        int dia = nacimiento.get(Calendar.DAY_OF_MONTH);
	        int mes = nacimiento.get(Calendar.MONTH) + 1;

	        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
	            return "Aries";
	        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
	            return "Tauro";
	        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	            return "Géminis";
	        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	            return "Cáncer";
	        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	            return "Leo";
	        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	            return "Virgo";
	        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	            return "Libra";
	        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	            return "Escorpio";
	        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	            return "Sagitario";
	        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
	            return "Capricornio";
	        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	            return "Acuario";
	        } else {
	            return "Piscis";
	        }
	    }

	    public String obtenerEstacion() {
	        int mes = nacimiento.get(Calendar.MONTH) + 1;

	        if (mes == 1 || mes == 2 || mes == 3) {
	            return "Verano";
	        } else if (mes == 4 || mes == 5 || mes == 6) {
	            return "Otoño";
	        } else if (mes == 7 || mes == 8 || mes == 9) {
	            return "Invierno";
	        } else {
	            return "Primavera";
	        }
	    }

		
		
		
		
}
