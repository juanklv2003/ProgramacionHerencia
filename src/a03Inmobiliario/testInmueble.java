package a03Inmobiliario;

import java.util.ArrayList;

import a03Inmobiliario.Local.tipo;

public class testInmueble {

	public static void main(String[] args) {
		
		ArrayList<Inmueble> inmo=new ArrayList<>();
		
		CasaRural casa1=new CasaRural(1, 50,"a 1", 3,2,3,1,1);
		CasaCerrado casa2=new CasaCerrado(2,100,"b 33", 4,2,1,1000,false,false);
		CasaIndependiente casa3=new CasaIndependiente(3,150,"c 44",5,3,2);
		ApartamentoFamiliar apar1=new ApartamentoFamiliar(4,60,"f3",2,1,100);
		ApartamentoEstudio apar2=new ApartamentoEstudio(1, 23, "rr 32", 4, 2);
		LocalComercial local1=new LocalComercial(5, 45, "esta  es 1", tipo.INTERNO, "Vialia");
		Oficina ofi1=new Oficina(6, 23, "foxhound34", tipo.CALLE, false);
		
		
		inmo.add(casa1);
		inmo.add(casa2);
		inmo.add(casa3);
		inmo.add(apar1);
		inmo.add(apar2);
		inmo.add(local1);
		inmo.add(ofi1);
		
		
		Double suma=0d;//para sumar todos los precios de los inmuebles q añadas
		Double totalImpuesto;
		for(Inmueble i:inmo) {
			i.listaValores();
			i.precioVenta();
			i.calculaImpuesto();
			totalImpuesto=i.precioVenta+i.impuesto;
			suma+=i.getPrecioVenta();
			System.out.println(i.toString()+"\n---->"+i.getPrecioVenta()+" sin impuesto añadido\n---->"+totalImpuesto+" precio mas el impuesto.\n");
			
		}
		
		System.out.println("total valor propiedades de la inmobiliaria\n---->"+suma);
	}
}
