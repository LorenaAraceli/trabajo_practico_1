package ar.edu.unju.fi.Model;


public class Pais {
    private int codigo;
    private String nombre;
    

    public Pais(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
	public void agregarDestinoTuristico(DestinoTuristico destino) {
		// TODO Auto-generated method stub
		
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
	
	  @Override
	    public String toString() {
	        return "Pais{" +
	                "codigo=" + codigo +
	                ", nombre='" + nombre + '\'' +
	                '}';
	    }
	  
}