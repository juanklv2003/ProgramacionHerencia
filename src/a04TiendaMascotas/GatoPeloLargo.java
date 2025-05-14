package a04TiendaMascotas;

public class GatoPeloLargo extends Gato{

	enum razasLargo{
		gato_normal,gato_tonto;
	}
	
	private razasLargo PeloLargo;

	public GatoPeloLargo(String nombre, int edad, String color, double saltoALtura, double saltoLargura,
			razasLargo peloLargo) {
		super(nombre, edad, color, saltoALtura, saltoLargura);
		PeloLargo = peloLargo;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nGatoPeloLargo: Raza=" + PeloLargo;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido()+" y sueltan pila pelo puaj";
	}
	
}
