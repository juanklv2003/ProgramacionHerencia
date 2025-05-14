package a10Mamifero;

public class TestMamifero {

	public static void main(String[] args) {
		
		Ballena mipollica=new Ballena("mobyduck", 12);
		
		mipollica.amamantarCrias();
		
		Ornitorrinco perry= new Ornitorrinco("perry", 1);
		
		perry.ponerHuevos();
		
		perry.amamantarCrias();
		
		
		Murcielago mami=new Murcielago("murphy", false);
		
		mami.amamantarCrias();
		
		mami.vuela("con cudaio");
		
		System.out.println(mami.toString());
	}
}
