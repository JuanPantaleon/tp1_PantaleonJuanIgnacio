package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int adicionalIngredientes20 = 500;
    private final int adicionalIngredientes30 = 750;
    private final int adicionalIngredientes40 = 1000;
    
    // Constructor por defecto
    public Pizza() {
    }

    // Getters & Setters
    
	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public int getAdicionalIngredientes20() {
		return adicionalIngredientes20;
	}

	public int getAdicionalIngredientes30() {
		return adicionalIngredientes30;
	}

	public int getAdicionalIngredientes40() {
		return adicionalIngredientes40;
	}
    
	// Método para calcular el precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
            if (ingredientesEspeciales == true)
                precio = 4500 + adicionalIngredientes20;
            else
                precio = 4500;
        } else if (diametro == 30) {
            if (ingredientesEspeciales)
                precio = 4800 + adicionalIngredientes30;
            else
                precio = 4800;
        } else if (diametro == 40) {
            if (ingredientesEspeciales)
                precio = 5500 + adicionalIngredientes40;
            else
                precio = 5500;
        }
    }
    
    
    // Método para calcular el área de la pizza
    public void calcularArea() {
        area = Math.PI * Math.pow((diametro / 2.0), 2);
    }
    
}
