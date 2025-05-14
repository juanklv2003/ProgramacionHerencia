package a07Aritmetica;

import java.util.Objects;

public class Numero {

	protected int num;
	
	//constructor
	public Numero(int numero) {
		this.num=num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	
	public Numero sumar(Numero numero) {
		return new Numero(this.getNum()+numero.getNum());
	}
	
	public Numero restar(Numero numero) {
		return new Numero(this.getNum()-numero.getNum());
	}
	
	public Numero multiplicar(Numero numero) {
		return new Numero(this.getNum()*numero.getNum());
	}
	
	//OJOOOOO
	public Numero division(Numero numero) {
		return new Numero(this.getNum()/numero.getNum());
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero otro = (Numero) obj;
		return num == otro.num;
	}

	@Override
	public String toString() {
		return "Numero [num=" + num + "]";
	}
	
	
}
