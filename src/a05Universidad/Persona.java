package a05Universidad;

public class Persona {

	protected String nombre;
	private String direccion;
	
	
	
	public Persona(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "Persona: nombre=" + nombre + ", direccion=" + direccion;
	}
	
	protected  String irClase() {
		return "";
	}
	
	
	
	
}
