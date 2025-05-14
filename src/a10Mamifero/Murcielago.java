package a10Mamifero;

public class Murcielago extends Mamifero implements Volador {

	private boolean colgado = true;

	public Murcielago(String nombre, boolean colgado) {
		super(nombre);
		this.colgado = colgado;
	}

	public boolean isColgado() {
		return colgado;
	}

	public void setColgado(boolean colgado) {
		this.colgado = colgado;
	}

	@Override
	public void amamantarCrias() {
		// TODO Auto-generated method stub
		System.out.println("por el pitilin");
	}

	@Override
	public void vuela(String como) {
		// TODO Auto-generated method stub
		System.out.println("con lsa alas---->"+como);
	}

	@Override
	public String toString() {
		return super.toString() + "\nMurcielago [colgado=" + colgado + "]";
	}

}
