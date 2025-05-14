package a04TiendaMascotas;

public class GatoPeloCorto extends Gato{

	enum razasCorto{
		azull_ruso,britanico,manx,devon_rex;
	}
	
	private razasCorto PeloCorto;

	public GatoPeloCorto(String nombre, int edad, String color, double saltoALtura, double saltoLargura,
			razasCorto peloCorto) {
		super(nombre, edad, color, saltoALtura, saltoLargura);
		PeloCorto = peloCorto;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nGatoPeloCorto: Raza=" + PeloCorto;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido()+" y son buenos si quiers";
	}
}
