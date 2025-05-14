package a04TiendaMascotas;

public class PerroGrande extends Perro{

	enum razaa{
		pastor_aleman,doberman,rotweiller;
	}
	
	private razaa Grandes;

	public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, razaa grandes) {
		super(nombre, edad, color, peso, muerde);
		Grandes = grandes;
	}

	@Override
	public String toString() {
		return super.toString()+"\nPerroGrande: Raza=" + Grandes;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido()+" y estos acojonan";
	}
	
}
