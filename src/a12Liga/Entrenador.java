package a12Liga;



public class Entrenador extends SeleccionFutbol{
	
	private int idFederacion;

	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Dirige entrenamiento");
		
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("Dirige el partido");
		
	}
	
	//Metodo propio
	public void planificarEntrenamiento() {
		System.out.println("Planificar entrenamiento");
	}
	
	public void preparaTactica() {
		System.out.println("Prepara la tactica");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nEntrenador idFederacion=" + idFederacion;
	}
	
	

}
