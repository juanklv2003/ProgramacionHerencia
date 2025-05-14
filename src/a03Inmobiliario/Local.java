package a03Inmobiliario;

public class Local extends Inmueble{

	enum tipo{
		INTERNO, 
		CALLE
	};
	
	protected tipo tipoLocal;

	public Local(int idInmo, int area, String direccion, tipo tipoLocal) {
		super(idInmo, area, direccion);
		// TODO Auto-generated constructor stub
		this.tipoLocal=tipoLocal;
	}

	@Override
	public String toString() {
		return super.toString()+"\nLocal: tipoLocal=" + tipoLocal;
	}

}
