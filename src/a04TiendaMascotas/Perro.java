package a04TiendaMascotas;

public class Perro extends Mascota {
	
	protected double peso;
	protected boolean muerde;
	
	
	public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
		super(nombre, edad, color);
		this.peso = peso;
		this.muerde = muerde;
	}


	@Override
	public String toString() {
		return super.toString()+ "\nPerro: peso=" + peso + ", muerde=" + muerde + "]";
	}
	
	@Override
	public String sonido() {
		return "perros no ladran";
	}
	
	
	

}
