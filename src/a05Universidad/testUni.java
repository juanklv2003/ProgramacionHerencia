package a05Universidad;

import java.util.ArrayList;

public class testUni {

	public static void main(String[] args) {
		
		Estudiante estudiante=new Estudiante("Aran", "basura 24", "psicologia", 2);
		Profesor profe= new Profesor("Angel", "JavaScript", "Soldadura", "Jefe");
		ProfesorTitular profe1=new ProfesorTitular("Pepe", "coia 2", "Imbecil", "tonto", "lengua");
		
		
		ArrayList<Estudiante> inutiles=new ArrayList<>();
		inutiles.add(estudiante);
		
		System.out.println("Estudiantes\n");
		for(Estudiante es:inutiles) {
			System.out.println(es.toString()+"\n"+es.irClase()+"\n");
		}
		
		ArrayList<Persona> profes=new ArrayList<>();
		profes.add(profe);
		profes.add(profe1);
		
		
		System.out.println("Profes\n");
		for(Persona pro:profes) {
			if(pro instanceof ProfesorTitular)
				System.out.println(pro.toString()+"\n"+pro.irClase()+ "\n");
			else
				System.out.println("NO ES UN OBJETO PROFESOR TITULAR");
		}
		
		System.out.println("otro ejercicio");
		Profesor profesor1= new ProfesorTitular(null, null, null, null, null);
		Persona pro2= (Profesor) profesor1;
		System.out.println(profesor1.toString());
		System.out.println(pro2.toString());
		
		
		ArrayList<Persona> per=new ArrayList<>();
		
		per.add(pro2);
		

	}
}
