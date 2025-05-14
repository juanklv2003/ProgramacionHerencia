package a01CuentaBanco;

import java.util.Scanner;

public class BancoTestCuenta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuenta ahorros");

		System.out.println("Ingrese saldo inicial= €");
		float saldoInicialAhorros = sc.nextFloat();

		System.out.println("Ingrese tasa de ahorros=");
		float tasaAhorros = sc.nextFloat();

		CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);

		System.out.print("Ingresa cantidad a depositar:");
		float cantidadDepositar = sc.nextFloat();

		cuenta1.ingresar(cantidadDepositar);

		System.out.print("Ingresa cantidad a retirar:");
		float cantidadRetirar = sc.nextFloat();

		cuenta1.retirar(cantidadRetirar);

		System.out.println("Calculo extracto del mes");
		cuenta1.extractoMensual();

		System.out.println(cuenta1.toString());

		System.out.println("Cuenta Corriente");

		System.out.println("Ingrese saldo inicial= €");
		float saldoInicialCorriente = sc.nextFloat();

		System.out.println("Ingrese tasa de anual=");
		float tasaCorriente = sc.nextFloat();

		CuentaCorriente cuenta2 = new CuentaCorriente(saldoInicialCorriente, tasaCorriente);

		System.out.print("Ingresa cantidad a depositar:");
		float cantidadDepositarCorri = sc.nextFloat();

		cuenta1.ingresar(cantidadDepositarCorri);

		System.out.print("Ingresa cantidad a retirar:");
		float cantidadRetirarCorri = sc.nextFloat();

		cuenta2.retirar(cantidadRetirarCorri);

		System.out.println("Calculo extracto del mes");
		cuenta2.extractoMensual();

		System.out.println(cuenta2.toString());
		
		sc.close();
	}
	
}
