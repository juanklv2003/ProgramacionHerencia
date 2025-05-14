package a09Medicina;

import java.util.ArrayList;

public class TestClinica {

	
	public static void main(String[] args) {
		
		Medico medi=new Medico("Jack");
		Medico pedi=new Pediatra("Orslok", Pediatra.tipologia.PSICOLOGO);
		Medico orto=new Ortopedista("Ibai", Ortopedista.tipologia.PEDIATRICA);
		
		ArrayList<Medico> clinica= new ArrayList<>();
		
		clinica.add(medi);
		clinica.add(pedi);
		clinica.add(orto);
		
		System.out.println("DOWCASTING comprobamos las clases");
		for (int i = 0; i < clinica.size(); i++) {
			
			Medico a = (Medico) clinica.get(i);
			
			if (a instanceof Ortopedista) { //determina si es un ortopedista
			System.out.println("El objeto en el indice "+ i + " es de la clase Ortopedista\n");
			continue;//esto hace q salte al siguiente objeto de la lista
			}
			
			if (a instanceof Pediatra) { //determina si es un pediatra
			System.out.println("El objeto en el indice " + i + " es de la clase Pediatra\n");
			continue;
			}
			
			if (a instanceof Medico) { //determina si es un medico
			System.out.println("El objeto en el indice " + i + " es de la clase Médico\n");
			continue;
			}
		}
		
		
		System.out.println("UPCASTING");
		for(Medico me:clinica) {
			System.out.println(me+"\n");
		}
	}
}
