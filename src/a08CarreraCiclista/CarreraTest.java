package a08CarreraCiclista;

public class CarreraTest {

	public static void main(String[] args) {
		
		//creamos equipos
		Equipo equipo1 = new Equipo("FOXHOUND","EEUU");
		Ciclista ciclis1 = new Ciclista(123979, "Big Boss");
		Ciclista ciclis2 = new Escalador(123980, "Solid Snake",0.8,5.5);
		Ciclista ciclis3 = new Velocista(123981, "Raiden",1d,12.5);
		Ciclista ciclis0= new Contrarelojista(123982, "Otacon", 12);
		
		//añado ciclistas
		equipo1.addCiclista(ciclis1);
		equipo1.addCiclista(ciclis2);
		equipo1.addCiclista(ciclis3);
		equipo1.addCiclista(ciclis0);
		
		Equipo equipo2 = new Equipo("LaElite","España");
		Ciclista ciclis4 = new Escalador(12, "David Evil",0.8,5.5);
		Ciclista ciclis5 = new Velocista(03, "Folagor", 1d,12.5);
		Ciclista ciclis6 = new Ciclista(01, "LaMaeb");
		Ciclista ciclis7= new Contrarelojista(45, "Skippy", 12);
		
		
		equipo2.addCiclista(ciclis4);
		equipo2.addCiclista(ciclis5);
		equipo2.addCiclista(ciclis6);
		equipo2.addCiclista(ciclis7);
		
		/*
		for(Ciclista c: equipo2.getListaCiclistas()) {
			c.correr();
		}
		
		System.out.println("\nEQUIPO LaElite");
		equipo2.listarEquipo();
		System.out.println("\nORDENAMOS POR TIEMPO\n");
		System.out.println("EQUIPO LaElite");
		equipo2.ordenaTiempoEquipo();
		equipo2.listarEquipo();
		
		
		/*
	//los ciclistas van a correr
		for(Ciclista c: equipo1.getListaCiclistas()) {
			c.correr();
		}
		
		//listado antes de ordenar
		System.out.println("\nEQUIPO FOXHOUND");
		equipo1.listarEquipo();
		System.out.println("\nORDENAMOS POR TIEMPO\n");
		System.out.println("EQUIPO FOXHOUND");
		equipo1.ordenaTiempoEquipo();
		equipo1.listarEquipo();
		
		
		
		
		
		//como ordenamos eseta lista???-->deberia ir por tiempo
		equipo1.calcularTotalTiempo();
		equipo2.calcularTotalTiempo();
		
		
		//cñasificacion general
		//equipo1.listarEquipo(); -- MEJORAR
		System.out.println("\nTiempo FOXHOUND");
		System.out.println(equipo1.toString());
		System.out.println("\nTiempo LaElite");
		System.out.println(equipo2.toString());
		*/
		
		
		System.out.println("VAMOS A HACERLO CON ETAPA\n");
		//crear etapa
		Etapa etapa1= new Etapa(1, "Barcelona");
		
		etapa1.addEquipos(equipo1);
		etapa1.addEquipos(equipo2);
		
		etapa1.addParticipantes(ciclis1);
		etapa1.addParticipantes(ciclis2);
		etapa1.addParticipantes(ciclis3);
		etapa1.addParticipantes(ciclis4);
		etapa1.addParticipantes(ciclis5);
		etapa1.addParticipantes(ciclis6);
		etapa1.addParticipantes(ciclis7);
		etapa1.addParticipantes(ciclis0);
		
		System.out.println(etapa1.toString());
		
		System.out.println("\nEquipos de la etapa:");
		etapa1.listarEquipos();
		
		System.out.println("\nCiclistas de los equipos:\n");
		etapa1.listarCiclistas();
		
		System.out.println("\nA CORRER JEFES");
		etapa1.disputaTiempo();
		
		System.out.println("\nORDENAMOS DESPUES DE CORRER\n");
		etapa1.ordenaTiempoParticipantes();
		
		//ponemos numero a las posiciones
		etapa1.numPosGeneral();
		
		System.out.println("Ciclistas despues de la carrera\n");
		etapa1.listarCiclistas();
		
		System.out.println("\nEquipos despues de la etapa:");
		etapa1.listarEquipos();
		
	}
}
