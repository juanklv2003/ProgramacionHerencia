package a10Mamifero;

public class Ornitorrinco extends Mamifero implements Oviparo{
	
	private int numCrias;

	public Ornitorrinco(String nombre, int numCrias) {
		super(nombre);
		this.numCrias = numCrias;
	}
	
	@Override
	public void amamantarCrias() {
		System.out.println("sudan lechita");
		
	}
	
	@Override
	public void ponerHuevos() {
		// TODO Auto-generated method stub
	System.out.println("pone huevos por el culo");	
	}

	@Override
	public String toString() {
		return super.toString() +"\n\tOrnitorrinco [numCrias=" + numCrias + "]";
	}
	
	

}
