package a03Inmobiliario;

public class ApartamentoEstudio extends Apartamento{

	public ApartamentoEstudio(int idInmo, int area, String direccion, int numHabitaciones, int numBannos) {
		super(idInmo, area, direccion, numHabitaciones, numBannos);
		// TODO Auto-generated constructor stub
	}
	
	void precioVenta() {
		 this.precioVenta=area*valorUni.get("Apartaestudio");
	 }
	 void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Apartaestudio");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }

	@Override
	public String toString() {
		return super.toString()+ "\nApartamentoEstudio:";
	}

	
	
	
	
}
