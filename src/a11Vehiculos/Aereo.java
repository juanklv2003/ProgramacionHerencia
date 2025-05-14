package a11Vehiculos;
//implementar reactor y alas
public class Aereo extends Vehiculo implements Reactor {

	public Aereo(int velocidadMax, int velocidadActual) {
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
	
	 void despegar() {
		System.out.println(this.getClass().getName()+"->esta despegando");
	}
	
	 void aterrizar() {
		 System.out.println(this.getClass().getName()+"->esta en el suelo");
	}
	
	 void volar() {
		 System.out.println(this.getClass().getName()+"->esta volando");
	}
	
	 @Override
	public String encender(String String) {
		// TODO Auto-generated method stub
		return String+" encendido";
	}
	 
	 @Override
	public String apagar(String String) {
		// TODO Auto-generated method stub
		return String+" apagar";
	}
}
