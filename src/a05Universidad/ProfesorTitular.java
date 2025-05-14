package a05Universidad;

public class ProfesorTitular extends Profesor{

	private String asignatura;
	
	

	public ProfesorTitular(String nombre, String direccion, String departamento, String categoria, String asignatura) {
		super(nombre, direccion, departamento, categoria);
		this.asignatura = asignatura;
	}
	
	

	public String getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}



	@Override
	protected String irClase() {
		return super.irClase()+"\nSuspenso por el titular en "+this.getCategoria()+" yo paso de ir a clase";
	}


//SI EL METODO EN LA CLASE PADRE ES PUBLICO 
//NO PUEDO HACERLO MAS RESTRINGIDO (EN ESTE CASO PROTECTED)
	@Override
	public String toString() {
		return super.toString()+ "\nProfesorTitular: asignatura=" + asignatura;
	}
	
	
	

}
