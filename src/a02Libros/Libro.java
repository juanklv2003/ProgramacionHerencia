package a02Libros;

public class Libro {

	protected String titulo;
	protected String autor;
	protected float precio;
	
	
	//constructor sin precio
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libro\n Titulo:" + titulo + ", Autor:" + autor + ", Precio:" + precio;
	}
	
	
}
