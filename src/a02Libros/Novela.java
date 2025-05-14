package a02Libros;

public class Novela extends Libro {

	//atr
	enum tipo{
		HISTORICA,ROMANTICA,POLICIACA,REALISTA,CIENCIA_FICCION,AVENTURAS;
	}
	
	private tipo tipoNovela;

	
	
	//constructor
	public Novela(String titulo, String autor, tipo tipoNovela) {
		super(titulo, autor);
		this.tipoNovela=tipoNovela;
	}



	public tipo getTipoNovela() {
		return tipoNovela;
	}



	public void setTipoNovela(tipo tipoNovela) {
		this.tipoNovela = tipoNovela;
	}



	@Override
	public String toString() {
		return "Novela\n Tipo de la Novela:" + tipoNovela + ", Titulo:" + titulo + ", Autor:" + autor + ", Precio:" + precio;
	}
	
	
}
