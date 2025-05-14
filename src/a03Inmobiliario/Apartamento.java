package a03Inmobiliario;

public class Apartamento extends Vivienda {

	public Apartamento(int idInmo, int area, String direccion, int numHabitaciones, int numBannos) {
		super(idInmo, area, direccion, numHabitaciones, numBannos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+ "\nApartamento:";
	}

	
	
}
