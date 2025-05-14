package a11Vehiculos;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Terrestre camioneta = new Terrestre(120, 0);
		camioneta.toString();
		
		System.out.println("Terrestre---> Camioneta");
		
		camioneta.acelerar(30);
		
		System.out.println("nueva vel actual->\n"+ camioneta.toString());
		
		Acuatico moto=new Acuatico(120, 10);
		
		System.out.println("Acuatico----> moto");
		
		moto.acelerar(50);
		
		System.out.println("revoluciones motor-> " +moto.calcularRevolucionesMotor(1200, 4));
	
		moto.recomendarVelocidad(20);
		System.out.println("nueva vel actual->\n"+moto.toString());

		
		Aereo ae= new Aereo(1000, 1);
		
		System.out.println("Aereo---> ae");
		
		System.out.println(ae.encender("3-2-1..."));
		
		ae.acelerar(200);
		
		ae.despegar();
		
		ae.volar();
		
		System.out.println(ae.toString());
	}
}
