package a04TiendaMascotas;

public class GatoSinPelo extends Gato{

	enum razaGato{
		esfinge,elfo,donskoy;
	}
	
	private razaGato SinPelo;

	public GatoSinPelo(String nombre, int edad, String color, double saltoALtura, double saltoLargura, razaGato sinPelo) {
		super(nombre, edad, color, saltoALtura, saltoLargura);
		SinPelo = sinPelo;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nGatoSinPelo: Raza=" + SinPelo;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido()+" y dan asco";
	}
}
