package a03Inmobiliario;

public class Casa extends Vivienda {

	protected int numPisos;

	public Casa(int idInmo, int area, String direccion, int numHabitaciones, int numBannos, int numPisos) {
		super(idInmo, area, direccion, numHabitaciones, numBannos);
		// TODO Auto-generated constructor stub
		this.numPisos=numPisos;
		
		
	}

	@Override
	public String toString() {
		return super.toString()+ "\nCasa: numPisos=" + numPisos;
	}
	
	
	
	
	
}
