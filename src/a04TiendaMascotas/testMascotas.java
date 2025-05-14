package a04TiendaMascotas;

import java.util.ArrayList;

import a04TiendaMascotas.GatoPeloCorto.razasCorto;
import a04TiendaMascotas.GatoPeloLargo.razasLargo;
import a04TiendaMascotas.GatoSinPelo.razaGato;
import a04TiendaMascotas.PerroGrande.razaa;
import a04TiendaMascotas.PerroMediano.razas;
import a04TiendaMascotas.PerroPequeno.raza;

public class testMascotas {

	public static void main(String[] args) {
		
		Perro mediano=new PerroMediano("TOntioto", 4, "verde", 7.9, false, razas.sabueso);
		Perro peque=new PerroPequeno("Messi", 1, "blanco", 5, true, raza.yorkshire);
		Perro grande=new PerroGrande("Pepito", 6, "marron", 10, false, razaa.pastor_aleman);
		
		Gato sinPelo=new GatoSinPelo("Miau", 2, "sin pelo", 4.6, 5.7, razaGato.esfinge);
		Gato corto=new GatoPeloCorto("Ki", 3, "marron y blanco", 3, 7, razasCorto.devon_rex);
		Gato largo=new GatoPeloLargo("Kuro", 2, "negro", 3.6, 5.6, razasLargo.gato_tonto);
		
		
		ArrayList<Gato> jatos= new ArrayList<>();
		ArrayList<Perro> perrete=new ArrayList<>();
		
		//perros
		perrete.add(mediano);
		perrete.add(peque);
		perrete.add(grande);
		
		//gatos
		jatos.add(sinPelo);
		jatos.add(corto);
		jatos.add(largo);
		
		System.out.println("Gatitos\n");
		for(Gato g:jatos) {
			System.out.println(g.toString()+"\nSonido: "+g.sonido()+"\n");
			
		}
		System.out.println("Perretes\n");
		for(Perro p:perrete) {
			System.out.println(p.toString()+"\nSonido: "+p.sonido()+"\n");
			
		}
	}
}
