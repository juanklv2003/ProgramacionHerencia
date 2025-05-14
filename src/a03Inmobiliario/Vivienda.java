package a03Inmobiliario;

public class Vivienda extends Inmueble{
	
	protected int numHabitaciones;
	protected int numBannos;

	//constructor 
	public Vivienda(int idInmo, int area, String direccion, int numHabitaciones, int numBannos) {//le pasas lo de la clase padre y sus atributos añadidos de esta clase
		super(idInmo, area, direccion);
		// TODO Auto-generated constructor stub
		this.numHabitaciones=numHabitaciones;
		this.numBannos=numBannos;
	}
	//no sobreescribo ningun metodo excepto toString
	@Override
	public String toString() {
		return super.toString()+"\nVivienda: numHabitaciones=" + numHabitaciones + ", numBannos=" + numBannos;
	}
	
	

}
