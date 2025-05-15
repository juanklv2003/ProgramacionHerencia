package a12Liga;

public abstract class SeleccionFutbol {

	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void viajar() {
		System.out.println("Viaja (Clase padre)");
	}
	
	public void concentrarse() {
		System.out.println("Se concentra (Clase padre)");
	}
	
	public abstract void entrenamiento();
	
	public abstract void partidoFutbol();
}
