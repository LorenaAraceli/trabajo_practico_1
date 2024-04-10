package ar.edu.unju.fi.Model;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento;

    public Producto() {
        // Constructor por defecto
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        if (descuento > 0 && descuento <= 50) {
            return precio * (1 - descuento / 100.0);
        } else {
            return precio;
        }
    }
}