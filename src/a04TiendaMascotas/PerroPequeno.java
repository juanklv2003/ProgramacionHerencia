package a04TiendaMascotas;

public class PerroPequeno extends Perro{

	enum raza{
		caniche,yorkshire,chihuahua,schnauzer;
	}
	
	private raza Pequeno;

	public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, raza pequeno) {
		super(nombre, edad, color, peso, muerde);
		Pequeno = pequeno;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nPerroPequeno: Raza=" + Pequeno;
	}
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido()+" y estos dan risa, vaya gilipollas q son";
	}
	
	
}
