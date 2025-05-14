package a04TiendaMascotas;


public class PerroMediano extends Perro{

	
	enum razas{
		collie,dalmata,bulldog,galgo,sabueso;
	}
	
	private razas Mediano;

	public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, razas mediano) {
		super(nombre, edad, color, peso, muerde);
		Mediano = mediano;
	}

	@Override
	public String toString() {
		return super.toString()+"\nPerroMediano: Raza=" + Mediano;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido()+" y estos divierten";
	}
	
}

