package a12Liga;

import java.util.ArrayList;

public class main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
		public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		public static void main(String[] args) {
			
			SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
			SeleccionFutbol pedri = new Futbolista(1, "Pedri", "Gonzalez", 22, 8, "mediocentro");
			SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

			integrantes.add(delBosque);
			integrantes.add(pedri);
			integrantes.add(raulMartinez);

			// CONCENTRACION
			System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.concentrarse();
			}

			// VIAJE
			System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.viajar();
			}
			
			// entreno
			System.out.println("\nTodos los integrantes entrenan");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.entrenamiento();
			}
			
			// juegan
			System.out.println("\nTodos los integrantes van al partido. (Todos ejecutan el mismo método)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				integrante.partidoFutbol();
			}
			
			//METODOS PROPIOS
			System.out.println("\nTODOS TIEENEN DISTINTOS METODOS PROPIOS (Todos ejecutan el mismo método)");
			for (SeleccionFutbol integrante : integrantes) {
				System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
				
				if(integrante instanceof Entrenador) {
					System.out.println(integrante.toString());
					((Entrenador) integrante).planificarEntrenamiento();
					((Entrenador) integrante).preparaTactica();
				}
				if(integrante instanceof Futbolista) {
					System.out.println(integrante.toString());
					((Futbolista) integrante).entrevista();
				}
				if(integrante instanceof Masajista) {
					System.out.println(integrante.toString());
					((Masajista) integrante).darMasaje();
				}
			}
		}

	}
