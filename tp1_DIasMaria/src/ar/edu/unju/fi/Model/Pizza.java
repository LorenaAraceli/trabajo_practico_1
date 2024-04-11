package ar.edu.unju.fi.Model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int adicionalIngredientesEspeciales20 = 500;
    private final int adicionalIngredientesEspeciales30 = 750;
    private final int adicionalIngredientesEspeciales40 = 1000;

    // Constructor
    public Pizza(int diametro, boolean ingredientesEspeciales) {
        this.diametro = diametro;
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Getters and setters
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

    // Métodos
    public void calcularPrecio() {
        if (diametro == 20) {
            if (ingredientesEspeciales) {
                precio = 4500 + adicionalIngredientesEspeciales20;
            } else {
                precio = 4500;
            }
        } else if (diametro == 30) {
            if (ingredientesEspeciales) {
                precio = 4800 + adicionalIngredientesEspeciales30;
            } else {
                precio = 4800;
            }
        } else if (diametro == 40) {
            if (ingredientesEspeciales) {
                precio = 5500 + adicionalIngredientesEspeciales40;
            } else {
                precio = 5500;
            }
        }
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}