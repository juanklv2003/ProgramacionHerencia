package a01CuentaBanco;

public class CuentaCorriente extends Cuenta {
	/*
	 * Atributo que define un sobregiro de la cuenta que surge cuando el saldo de la
	 * cuenta es negativo
	 */
	float numRojos;

	public CuentaCorriente(float saldo, float tasa) {
		super(saldo, tasa); // Invoca al constructor de la clase padre
		numRojos = 0; // Inicialmente no hay sobregiro
	}

	// completo
	public CuentaCorriente(float saldo, int numConsignaciones, int numRetiros, float tasaAnual,
			int comisionMensual, float rojo) {
		super(saldo, numConsignaciones, numRetiros, tasaAnual, comisionMensual);
		this.numRojos = rojo;

	}

	/*
	 * Método que recibe una cantidad de dinero a retirar y actualiza el saldo de la
	 * cuenta
	 * 
	 * @param cantidad Parámetro que define la cantidad de dinero a retirar de la
	 * cuenta corriente
	 */
	public void retirar(float cantidad) {
		float resultado = saldo - cantidad; // Se calcula un saldo temporal
		/*
		 * Si el valor a retirar supera el saldo de la cuenta, el valor excedente se
		 * convierte en sobregiro y el saldo es cero
		 */
		if (resultado < 0) {
			numRojos = numRojos - resultado;
			saldo = 0;
		} else {
			super.retirar(cantidad); /*
										 * Si no hay sobregiro, se realiza un retiro normal
										 */
		}
	}

	/**
	 * Método que recibe una cantidad de dinero a consignar y actualiza el saldo de
	 * la cuenta
	 * 
	 * @param cantidad Parámetro que define la cantidad de dinero a consignar en la
	 *                 cuenta corriente
	 */
	public void ingresar(float cantidad) {
		float residuo = numRojos - cantidad;
		// Si existe sobregiro la cantidad consignada se resta al sobregiro
		if (numRojos > 0) {
			if (residuo > 0) { /* Si el residuo es mayor que cero, se libera el sobregiro */
				numRojos = 0;
				saldo = residuo;
			} else { /* Si el residuo es menor que cero, el saldo es cero y surge un sobregiro */
				numRojos = -residuo;
				saldo = 0;
			}
		} else {
			super.ingresar(cantidad);
			/* Si no hay sobregiro, se realiza una consignación normal */
		}
	}

	/**
	 * Método que genera el extracto mensual de la cuenta
	 */
	public void extractoMensual() {
		super.extractoMensual(); // Invoca al método de la clase padre
	}

	/**
	 * Método que muestra en pantalla los datos de una cuenta corriente
	 */
	@Override
	public String toString() {
		return "CuentaCorriente en Numeros rojos=" + numRojos + ", saldo=" + saldo + ", numeroConsignaciones="
				+ numConsignaciones + ", numeroRetiros=" + numRetiros + ", tasaAnual=" + tasaAnual
				+ ", comisionMensual=" + comisionMensual + "";
	}

}

