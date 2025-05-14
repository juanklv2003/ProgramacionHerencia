package a03Inmobiliario;

public class ApartamentoFamiliar extends Apartamento{

	
	private int valorAdmin;
	
	
	public ApartamentoFamiliar(int idInmo, int area, String direccion, int numHabitaciones, int numBannos, int admin) {
		super(idInmo, area, direccion, numHabitaciones, numBannos);
		// TODO Auto-generated constructor stub
		
		this.valorAdmin=admin;
	}
	
	void precioVenta() {
		 this.precioVenta=area*valorUni.get("Apartamento familiar");
	 }
	 void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Apartamento familiar");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }


	@Override
	public String toString() {
		return super.toString()+"\nApartamentoFamiliar: valorAdmin=" + valorAdmin;
	}
	
	

	
	
	
}
