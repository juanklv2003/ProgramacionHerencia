package a12Liga;

public class Futbolista extends SeleccionFutbol{

	private int dorsal;
	private int posicion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, int posicion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("entrena");
		
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("juega");
		
	}
	
	//metodos propios
	public void entrevista() {
		System.out.println("da entrevista");
	}

	@Override
	public String toString() {
		return super.toString() +"\nFutbolista dorsal=" + dorsal + ", posicion=" + posicion;
	}
	
	
	
}
