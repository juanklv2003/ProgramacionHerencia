package a03Inmobiliario;

public class Oficina extends Local{

	private boolean esGobierno;

	public Oficina(int idInmo, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
		super(idInmo, area, direccion, tipoLocal);
		// TODO Auto-generated constructor stub
		this.esGobierno=esGobierno;
	}
	
	void precioVenta() {
		 this.precioVenta=area*valorUni.get("Oficina");
	 }
	 void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("Oficina");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }

	@Override
	public String toString() {
		return super.toString()+ "\nOficina: esGobierno=" + esGobierno;
	}
	
	
	
	
}
