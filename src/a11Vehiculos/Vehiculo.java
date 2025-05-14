package a11Vehiculos;

public abstract class Vehiculo {
	
	int velocidadMax;
	int velocidadActual;
	
	public Vehiculo(int velocidadMax, int velocidadActual) {
		super();
		this.velocidadMax = velocidadMax;
		this.velocidadActual = velocidadActual;
	}
	
	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	abstract void acelerar(int velocidad);
	
	abstract void frenar(int velocidad);

	@Override
	public String toString() {
		return "Vehiculo velocidadMax->" + velocidadMax + ", velocidadActual->" + velocidadActual;
	}
	
	
}
