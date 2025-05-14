package a02Libros;

public class LibroTextoUni extends LibrosDeTexto{

	//atr
	private String facultad;


	
	
	//constructor
	public LibroTextoUni(String titulo, String autor, String curso, String facultad) {
		super(titulo, autor,curso);
		this.facultad=facultad;
	}




	public String getFacultad() {
		return facultad;
	}




	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}




	@Override
	public String toString() {
		return "LibroTextoUni\n Facultad:" + facultad + ", Titulo:" + titulo + ", Curso:" + curso + ", Autor:" + autor
				+ ", Precio:" + precio;
	}
	
	

}
