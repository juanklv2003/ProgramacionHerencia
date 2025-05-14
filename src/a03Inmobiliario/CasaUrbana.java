package a03Inmobiliario;

public class CasaUrbana extends Casa{

	public CasaUrbana(int idInmo, int area, String direccion, int numHabitaciones, int numBannos, int numPisos) {
		super(idInmo, area, direccion, numHabitaciones, numBannos, numPisos);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nCasaUrbana:";
	}
	
	

}
