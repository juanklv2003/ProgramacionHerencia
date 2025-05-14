package a03Inmobiliario;

import java.util.HashMap;

public class Inmueble {

	
	//vamos a crear un map para almacenar los precios unitarios para 
	//cada categoria de las 7 q m proporciona el ejercicio
/*
	Inmueble		Valor por metro cuadrado
	Casa rural  			$ 1500000
	
	Casa en conjunto cerrado  $ 2500000
	
	Casa independiente  	$ 3000000
	
	Apartaestudio  			$ 1500000
	
	Apartamento familiar  	$ 2000000
	
	Local comercial  		$ 3000000
	
	Oficina  				$ 3500000
	*/
	
	//STATIC??
	protected HashMap<String,Double> valorUni;
	
	//STATIC???
	public void listaValores(){
		valorUni=new HashMap<String,Double>();
		this.valorUni.put("Casa rural", 1500.0);
		this.valorUni.put("Casa en conjunto cerrado", 2500.0);
		this.valorUni.put("Casa independiente", 3000.0);
		this.valorUni.put("Apartaestudio", 1500.0);
		this.valorUni.put("Apartamento familiar", 15000.0);
		this.valorUni.put("Local comercial", 3000.0);
		this.valorUni.put("Oficina", 3500.0);
		this.valorUni.put("zero", 0d);
	}
	
	
	//atr
	protected int idInmo;
	protected int area;
	protected String direccion;
	protected double precioVenta;
	protected double impuesto;
	
	
	 Inmueble(int idInmo, int area, String direccion) {
		
		this.idInmo = idInmo;
		this.area = area;
		this.direccion = direccion;
		this.precioVenta=0d;
	}
	
	/**
	 * Metodo que a partir del valorArea de un inmueble calcula el precio de venta
	 * @param valorAreaUnitaria el valor del area de un inmueble segun tabla
	 * @return precio de venta
	 * */
	 void precioVenta() {
	
		 this.precioVenta=area*valorUni.get("zero");
	 }
	 void calculaImpuesto() {
		 this.precioVenta=area*valorUni.get("zero");
		 impuesto=(this.precioVenta*1.01)-this.precioVenta;
	 }
	 //precisamos un getter 

	public double getPrecioVenta() {
		return precioVenta;
	}

	@Override
	public String toString() {
		return "Inmueble: idInmo=" + idInmo + ", area=" + area + ", direccion=" + direccion + ", precioVenta="
				+ precioVenta+ ", impuesto="+impuesto;
	}



	 
	 
	 //uso 1 llama a lista valores 
	//3 con el getter del precio de eventa tienes un double 
}
