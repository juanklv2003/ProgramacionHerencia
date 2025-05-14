package a02Libros;

import java.util.ArrayList;
import java.util.Scanner;

import a02Libros.Novela.tipo;

public class TesteaLibros {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Libro\n");
		
		System.out.print("Dime titulo:");
		String titulo=sc.nextLine();
		
		System.out.print("Dime autor:");
		String autor=sc.nextLine();

		
		Libro libro=new Libro(titulo,autor);
		libro.setPrecio(7.5f);
		
		//System.out.println(libro.toString());
		
		//Libro texto
		System.out.println("\nLibro de Texto\n");
		
		System.out.print("Dime titulo:");
		String tituloText=sc.nextLine();
		
		System.out.print("Dime autor:");
		String autorText=sc.nextLine();

		System.out.print("Dime curso:");
		String curso=sc.nextLine();
		
		LibrosDeTexto libroText=new LibrosDeTexto(tituloText,autorText,curso);
		libroText.setPrecio(12.54f);
		
		//System.out.println(libroText.toString());
		
		System.out.println("\nLibro a05Universidad\n");
		
		LibroTextoUni libroUni= new LibroTextoUni("Fisica","Juan","1 BACH", "Facultad de Torero");
		
		libroUni.setPrecio(100);
		
		//System.out.println(libroUni.toString());
		
		System.out.println("\nNOVELA\n");
		
		Novela novela=new Novela("Biblia", "Yo", tipo.CIENCIA_FICCION);
		
		//System.out.println(novela.toString());
		
		ArrayList<Libro> biblioteca= new ArrayList<Libro>();
		
		biblioteca.add(libro);
		biblioteca.add(libroText);
		biblioteca.add(libroUni);
		biblioteca.add(novela);
		
		for(Libro li:biblioteca) {
			System.out.println(li.toString()+"\n");
		}
		
		sc.close();
	}
}
