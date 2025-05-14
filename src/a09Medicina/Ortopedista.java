package a09Medicina;

public class Ortopedista extends Medico {

	enum tipologia {
		MAXILOFACIAL, PEDIATRICA
	};

	protected tipologia tipo;

	public Ortopedista(String nombre, tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public tipologia getTipo() {
		return tipo;
	}

	public void setTipo(tipologia tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n\tOrtopedista tipo->" + tipo;
	}

}
