package a03Inmobiliario;

public class LocalComercial extends Local{

	private String centroComercial;

	public LocalComercial(int idInmo, int area, String direccion, tipo tipoLocal, String centroComercial) {
		super(idInmo, area, direccion, tipoLocal);
		// TODO Auto-generated constructor stub
		this.centroComercial=centroComercial;
	
	}
	
	void precioVenta() {
		 this.precioVenta=area*valorUni.get("Local comercial");
	 }
	void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Local comercial");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }
	
	

	@Override
	public String toString() {
		return super.toString()+"\nLocalComercial: centroComercial=" + centroComercial;
	}
	
	
	
}
