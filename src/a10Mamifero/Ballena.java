package a10Mamifero;

public class Ballena extends Mamifero{

private double peso;

public Ballena(String nombre, double peso) {
	super(nombre);
	this.peso = peso;
}

public void amamantarCrias() {
	System.out.println("La ballena da de comer a sus crias");
}

@Override
public String toString() {
	return super.toString() +"\n\tBallena peso=" + peso;
}



}
