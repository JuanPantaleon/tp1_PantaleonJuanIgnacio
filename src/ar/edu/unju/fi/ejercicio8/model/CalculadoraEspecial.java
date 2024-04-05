package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int k; // atributo privado

    // Constructor por defecto
    public CalculadoraEspecial() {
        this.k = 0; // Valor por defecto
    }

    // getters & setters

    public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}



	// Método para calcular la sumatoria
    public double calcularSumatoria() {
        double sumatoria = 0;
        for (int i = 1; i <= k; i++) {
            sumatoria += (Math.pow( (k*(k+1))/2, 2));
        }
        return sumatoria;
    }
    
    public double  calcularProductoria() {
    	double productoria=1;
    	for (int i = 1; i <= k; i++) {
            productoria = productoria * (k*(k+4));
    	}
    	return (double)productoria;
    }
    }

