package a02Libros;

public class LibrosDeTexto extends Libro {

	protected String titulo;
	protected String curso;
	
	
	public LibrosDeTexto(String titulo, String autor, String curso) {
		super(titulo, autor);
		this.titulo=titulo;
		this.curso=curso;
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "LibrosDeTexto\n Titulo:" + titulo + ", Curso:" + curso + ", Autor:" + autor + ", Precio:" + precio;
	}
	
	

	
	



	
	
	
}
