package a04TiendaMascotas;

public class Gato extends Mascota{

	protected double saltoALtura;
	protected double saltoLargura;
	
	
	public Gato(String nombre, int edad, String color, double saltoALtura, double saltoLargura) {
		super(nombre, edad, color);
		this.saltoALtura = saltoALtura;
		this.saltoLargura = saltoLargura;
	}


	@Override
	public String toString() {
		return super.toString()+ "\nGato: saltoALtura=" + saltoALtura + ", saltoLargura=" + saltoLargura;
	}
	
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "miau";
	}
}
