package a12Liga;


public class Masajista extends SeleccionFutbol{

	private String titulacion;
	private int anosExperiencia;
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int anosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.anosExperiencia = anosExperiencia;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Masajea a la gente (con final feliz)");
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("No hace nada");
		
	}
	
	//metodos propios
	public void darMasaje() {
		System.out.println("DA masaje");
	}
	@Override
	public String toString() {
		return super.toString()+ "\nMasajista titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia;
	}
}
