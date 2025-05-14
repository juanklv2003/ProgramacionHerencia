package a03Inmobiliario;

public class CasaRural extends Casa{

	private int disCabera;
	private int altitud;
	
	
	public CasaRural(int idInmo, int area, String direccion, int numHabitaciones, int numBannos, int numPisos, int disCabera, int altitud) {
		super(idInmo, area, direccion, numHabitaciones, numBannos, numPisos);
		// TODO Auto-generated constructor stub
		
		this.disCabera=disCabera;
		this.altitud=altitud;
	}
	
	//hemos heredado calculaPrecioVenta lo tocamos???
	 void precioVenta() {
		 this.precioVenta=area*valorUni.get("Casa rural");
	 }
	 void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Casa rural");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }
	
	
	
	
	
	@Override
	public String toString() {
		return super.toString()+ "\nCasaRural: disCabera=" + disCabera + ", altitud=" + altitud;
	}
	
	
	
	
	
	
	
}
