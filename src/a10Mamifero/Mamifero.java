package a10Mamifero;

public abstract class Mamifero {

	protected String nombre;
	
	
	
	public Mamifero(String nombre) {
		super();
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public abstract void amamantarCrias();


	@Override
	public String toString() {
		return "Mamifero [nombre=" + nombre + "]";
	}
}