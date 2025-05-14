package a11Vehiculos;

public class Acuatico extends Vehiculo implements Vela,Motor{

	public Acuatico(int velocidadMax, int velocidadActual) {
		super(velocidadMax, velocidadActual);
	}

	@Override
	void acelerar(int velocidad) {
		int vel=this.velocidadActual+velocidad;
		if(vel>this.velocidadMax) {
			System.out.println("Superas las velocidad max permitida");
		}else {
			this.velocidadActual=vel;
		}
	}
	
	@Override
	void frenar(int velocidad) {
		int fren=this.velocidadActual-velocidad;
		if(fren<=0) {
			System.out.println("T has parao gilipollas");
		}else {
			this.velocidadActual=fren;
		}
	}
	
	public int calcularRevolucionesMotor(int fuerza, int radio){
		return fuerza*radio;
	}
	
	public void recomendarVelocidad(int velocidadViento) {
		if(velocidadViento >80 || velocidadViento<10) {
			velocidadActual=0;
		}
	}
}
