package it.aleo.thinkingInJava.operators.esercizioDue;

public class Aliasing {

	float f;
	
	public static void main(String[] args) {
	
		Aliasing a1 = new Aliasing ();
		a1.f = 12;
		
		Aliasing a2 = new Aliasing ();
		a2.f = 14;
		
		a1 = a2;
		
		System.out.println("Il float ha cambiato valore perché la reference ha cambiato l'oggetto a cui fa riferimento " + a1.f);
	}

}
