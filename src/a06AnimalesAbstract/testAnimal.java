package a06AnimalesAbstract;

import java.util.ArrayList;

public class testAnimal {

	public static void main(String[] args) {
		
		Leon leon=new Leon();
		
		Gato gato=new Gato();
		
		Perro perro=new Perro();
		
		Lobo lobo=new Lobo();
		
		ArrayList<Animal> listado=new ArrayList<Animal>();
		
		listado.add(perro);
		listado.add(leon);
		listado.add(gato);
		listado.add(lobo);
		
		for(Animal s:listado) {
			System.out.println(s.toString());
		}
	}
}
