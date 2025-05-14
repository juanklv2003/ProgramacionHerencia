package a01CuentaBanco;

public class Cuenta {

	// atr
	protected float saldo;
	protected int numRetiros = 0;
	protected float tasaAnual;
	protected float comisionMensual = 0;
	protected int numConsignaciones;

	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	// constructor completo
	public Cuenta(float saldo, int numRetiros, float tasaAnual, float comisionMensual, int numConsignaciones) {
		super();// construimos objeto de la clase padre
		this.saldo = saldo;
		this.numRetiros = numRetiros;
		this.tasaAnual = tasaAnual;
		this.comisionMensual = comisionMensual;
		this.numConsignaciones = numConsignaciones;
	}

	public void ingresar(float cantidad) {
		saldo += cantidad;
		numConsignaciones++;
	}
	
	
	public void retirar(float cantidad) {
		float nuevoSaldo=saldo-cantidad;
		if(nuevoSaldo>=0) {
			saldo-=cantidad;
			numRetiros++;
		}else {
			System.out.println("La cantidad a retirar excede el saldo actual");
		}
	}
	
	
	//calculo de interes
	public void calcularInteres() {
		float tasaMensual=tasaAnual/12;
		float interesMensual=saldo*tasaMensual;
		saldo+=interesMensual;
	}
	
	//calculo de comision
	public void extractoMensual() {
		saldo-=comisionMensual;
		calcularInteres();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	public int getNumConsignaciones() {
		return numConsignaciones;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		this.numConsignaciones = numConsignaciones;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numRetiros=" + numRetiros + ", tasaAnual=" + tasaAnual
				+ ", comisionMensual=" + comisionMensual + ", numConsignaciones=" + numConsignaciones + "]";
	}
	
	

}
