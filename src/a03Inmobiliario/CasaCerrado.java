package a03Inmobiliario;

public class CasaCerrado extends CasaUrbana {

	
	private double valorAdmin;
	private boolean tienePiscina;
	private boolean camposDeportivos;
	
	
	public CasaCerrado(int idInmo, int area, String direccion, int numHabitaciones, int numBannos, int numPisos, double valorAdmin,boolean tienePiscina, boolean camposDeportivos) {
		super(idInmo, area, direccion, numHabitaciones, numBannos, numPisos);
		// TODO Auto-generated constructor stub
		this.valorAdmin=valorAdmin;
		this.tienePiscina=tienePiscina;
		this.camposDeportivos=camposDeportivos;
	}

	//lee pasamos el precio de venta de casa en conjunto cerrado
	void precioVenta() {
		 this.precioVenta=area*valorUni.get("Casa en conjunto cerrado");
	 }
	 void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Casa en conjunto cerrado");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }
	

	@Override
	public String toString() {
		return super.toString()+"\nCasaCerrado: valorAdmin=" + valorAdmin + ", tienePiscina=" + tienePiscina + ", camposDeportivos="
				+ camposDeportivos;
	}
	
	
	
	
	
	
}
