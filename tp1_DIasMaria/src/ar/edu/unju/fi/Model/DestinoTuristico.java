package ar.edu.unju.fi.Model;


public class DestinoTuristico {
    private int codigo;
    private String nombre;
    private double precio;
    private Pais pais;
    private int cantidadDias;
    
  
    public DestinoTuristico(int codigo, String nombre, double precio, Pais pais, int cantidadDias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.pais = pais;
        this.cantidadDias = cantidadDias;
    }

	

	public DestinoTuristico(String nombreDestino, String descripcionDestino, Pais pais2) {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	@Override
    public String toString() {
        return "DestinoTuristico{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", pais=" + pais +
                ", cantidadDias=" + cantidadDias +
                '}';
    }
    
}