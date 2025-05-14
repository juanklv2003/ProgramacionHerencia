package a08CarreraCiclista;

import java.util.ArrayList;
import java.util.Collections;

public class Etapa {

	// atr
	private int num;
	private String nombre;// origen y destino
	private ArrayList<Equipo> listaEquipos;

	// Listadi de todos los ciclistas
	private ArrayList<Ciclista> participantes;

	public Etapa(int num, String nombre) {
		super();
		this.num = num;
		this.nombre = nombre;
		listaEquipos = new ArrayList<Equipo>();
		participantes = new ArrayList<Ciclista>();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public ArrayList<Ciclista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Ciclista> participantes) {
		this.participantes = participantes;
	}

	public void addEquipos(Equipo equipo) {
		listaEquipos.add(equipo);
	}

	public void addParticipantes(Ciclista ciclis) {
		participantes.add(ciclis);

	}


	// ordena participantes por tiempo --> necesitare setear la posicion en la
	// general??
	public void ordenaTiempoParticipantes() {
		Collections.sort(participantes);
	}

	// listar participantes (GENERAL INDIVIDUAL)
	public void listarCiclistas() {
		System.out.println("CLASIFICACION GENERAL");
		for (Ciclista c : participantes) {

			System.out.println(c);

		}
	}

	// listar equipos (GENERAL POR EQUIPOS)
	public void listarEquipos() {
		for (Equipo e : listaEquipos) {
			System.out.println(e);
		}
	}

	// a correr
	public void disputaTiempo() {
		for (Ciclista c : participantes) {
			c.correr();
		}
		for (Equipo e : listaEquipos) {
			e.calcularTotalTiempo();
		}
	}
	
	// ordenar equipos por tiempo
	public void ordenaTiempo() {
		for (Equipo e : listaEquipos)
			e.ordenaTiempoEquipo();

	}
	
	public void numPosGeneral() {
		int pos=1;
		for (Ciclista c : participantes) {
			c.setPosGeneral(pos);
			pos++;
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Etapa Num:" + num + ", nombre: " + nombre;
	}

}