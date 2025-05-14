package a01CuentaBanco;

public class CuentaAhorros extends Cuenta {

	//atr los cinco d su papi Cuenta
	//atr q determina si esta activa si esta activa si el saldo es superior a 1000
	private boolean activa;

	
	//constructores
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);//invoca los atributos de la clase padre
		
		if(saldo<1000) activa =false;
		
		else activa= true;
	}
	
	//constructor completo incluido activa
	public CuentaAhorros(float saldo, int numeroConsignaciones, int numRetiros, float tasaAnual, int comisionMensual, boolean activa) {
		super(saldo, numeroConsignaciones, numRetiros, tasaAnual, comisionMensual);
		this.activa=activa;
	}
	
	//metodos SObreescritos???
	@Override
	public void retirar(float cantidad) {
		//si activa es true se puede retirar money
		if(activa)
			
			super.retirar(cantidad);
	}
	@Override
	public void ingresar(float cantidad) {
		if(activa)
			super.ingresar(cantidad);
	}
	
	//Sobreescribimos extracto mensual
	public void extractoMensual() {
		if(numRetiros>4) {
			comisionMensual+=(numRetiros-4)*1000;
		}
		super.extractoMensual();
		if(saldo<1000) activa=false;
	}

	@Override
	public String toString() {
		return "CuentaAhorros activa=" + activa + ", saldo=" + saldo + ", numRetiros=" + numRetiros + ", tasaAnual="
				+ tasaAnual + ", comisionMensual=" + comisionMensual + ", numConsignaciones=" + numConsignaciones;
	}
	
	//metodos nuevos->no hay pero podria
	
	
}
	
