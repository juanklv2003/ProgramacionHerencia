package a06AnimalesAbstract;

public abstract class Animal {

	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombreCientifico;
	
	
	//NO CONSTRUCTOR
	
	//SOLO GETTERS
	
	public abstract String getSonido();

	public abstract String getAlimentos();

	public abstract String getHabitat();
	
	public abstract String getNombreCientifico();

	@Override
	public String toString() {
		return "Animal [getSonido()=" + getSonido() + ", getAlimentos()=" + getAlimentos() + ", getHabitat()="
				+ getHabitat() + ", getNombreCientifico()=" + getNombreCientifico() + "]";
	}


	
}
