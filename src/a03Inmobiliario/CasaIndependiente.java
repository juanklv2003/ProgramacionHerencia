package a03Inmobiliario;

public class CasaIndependiente extends CasaUrbana{

	public CasaIndependiente(int idInmo, int area, String direccion, int numHabitaciones, int numBannos, int numPisos) {
		super(idInmo, area, direccion, numHabitaciones, numBannos, numPisos);
		// TODO Auto-generated constructor stub
	}

	void precioVenta() {
		 this.precioVenta=area*valorUni.get("Casa independiente");
	 }
	void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Casa independiente");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }
	
	@Override
	public String toString() {
		return super.toString()+ "\nCasaIndependiente: []";
	}
	
	

}
